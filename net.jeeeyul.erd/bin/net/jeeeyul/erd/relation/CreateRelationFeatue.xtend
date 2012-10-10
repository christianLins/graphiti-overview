package net.jeeeyul.erd.relation

import com.google.inject.Inject
import java.util.UUID
import net.jeeeyul.erd.SharedImages$ICON16
import net.jeeeyul.erd.model.erd.ErdFactory
import net.jeeeyul.erd.model.erd.Table
import net.jeeeyul.erd.module.IErdExtensions
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.ICreateConnectionContext
import org.eclipse.graphiti.features.context.impl.AddConnectionContext
import org.eclipse.graphiti.features.context.impl.CreateConnectionContext
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature
import org.eclipse.graphiti.mm.pictograms.AnchorContainer
import org.eclipse.graphiti.mm.pictograms.Connection
import org.eclipse.graphiti.services.IPeService

class CreateRelationFeatue extends AbstractCreateConnectionFeature {
	@Inject extension IErdExtensions
	@Inject extension IPeService
	
	@Inject
	new(IFeatureProvider fp) {
		super(fp, "Relation", "Create New Relation")
	}
	
	override startConnecting() {
	}
	
	override getCreateImageId() {
		SharedImages$ICON16::CREATE_RELATION
	}
	
	def ICreateConnectionContext transformed(ICreateConnectionContext context){
		var ccc = new CreateConnectionContext() => [
			sourcePictogramElement = context.sourcePictogramElement
			targetPictogramElement = context.targetPictogramElement
			sourceLocation = context.sourceLocation
			targetLocation = context.targetLocation
			sourceAnchor = context.sourceAnchor
			targetAnchor = context.targetAnchor
		]
		
		if(context.sourcePictogramElement.tag == "column-root"){
			ccc.sourcePictogramElement = context.sourcePictogramElement.findContainerByTag("table-root")
			ccc.sourceAnchor = (ccc.sourcePictogramElement as AnchorContainer).chopboxAnchor
		}
		
		if(context.targetPictogramElement.tag == "column-root"){
			ccc.targetPictogramElement = context.targetPictogramElement.findContainerByTag("table-root")
			ccc.targetAnchor = (ccc.targetPictogramElement as AnchorContainer).chopboxAnchor
		}
		
		return ccc
	}
	
	override canCreate(ICreateConnectionContext context) {
		var ctx = context.transformed()
		
		ctx.sourcePictogramElement.businessObjectForPictogramElement instanceof Table &&
		ctx.targetPictogramElement.businessObjectForPictogramElement instanceof Table &&
		ctx.sourcePictogramElement.businessObjectForPictogramElement !=
		ctx.targetPictogramElement.businessObjectForPictogramElement
	}
	
	override canStartConnection(ICreateConnectionContext context) {
		var ctx = context.transformed()
		ctx.sourcePictogramElement.businessObjectForPictogramElement instanceof Table
	}
	
	override create(ICreateConnectionContext originalContext) {
		var context = originalContext.transformed
		
		val sourceTable = context.sourcePictogramElement.businessObjectForPictogramElement as Table
		val targetTable = context.targetPictogramElement.businessObjectForPictogramElement as Table
		
		var reference = ErdFactory::eINSTANCE.createTableRefererence => [
			uuid = UUID::randomUUID.toString
			name = "New Reference"
			it.targetTable = targetTable
		]
		sourceTable.references += reference
		
		var ctx = new AddConnectionContext(context.sourceAnchor, context.targetAnchor)
		ctx.newObject = reference
		
		val connection = featureProvider.addIfPossible(ctx) as Connection
		
		featureProvider.directEditingInfo => [
			active = true
			mainPictogramElement = connection
			pictogramElement = connection.getShapeByTag("relation-text")
			graphicsAlgorithm = connection.getShapeByTag("relation-text").graphicsAlgorithm
		]
		
		sourceTable.references += reference

		return connection
	}
	
}