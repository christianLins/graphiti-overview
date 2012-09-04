package net.jeeeyul.erd.relation

import com.google.inject.Inject
import java.util.UUID
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.ICreateConnectionContext
import org.eclipse.graphiti.features.context.impl.AddConnectionContext
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature
import org.eclipse.graphiti.mm.pictograms.Connection
import net.jeeeyul.erd.model.erd.Table
import net.jeeeyul.erd.model.erd.ErdFactory

class CreateRelationFeatue extends AbstractCreateConnectionFeature {
	@Inject
	new(IFeatureProvider fp) {
		super(fp, "Relation", "Create New Relation")
	}
	
	override canCreate(ICreateConnectionContext context) {
		context.sourcePictogramElement.businessObjectForPictogramElement instanceof Table &&
		context.targetPictogramElement.businessObjectForPictogramElement instanceof Table &&
		context.sourcePictogramElement.businessObjectForPictogramElement !=
		context.targetPictogramElement.businessObjectForPictogramElement
	}
	
	override canStartConnection(ICreateConnectionContext context) {
		context.sourcePictogramElement.businessObjectForPictogramElement instanceof Table
	}
	
	override create(ICreateConnectionContext context) {
		val sourceTable = context.sourcePictogramElement.businessObjectForPictogramElement as Table
		val targetTable = context.targetPictogramElement.businessObjectForPictogramElement as Table
		
		var reference = ErdFactory::eINSTANCE.createTableRefererence => [
			uuid = UUID::randomUUID.toString
			name = "New Referernce"
			it.targetTable = targetTable
		]
		sourceTable.references += reference
		
		var ctx = new AddConnectionContext(context.sourceAnchor, context.targetAnchor)
		ctx.newObject = reference
		
		var connection = featureProvider.addIfPossible(ctx) as Connection
		
		sourceTable.references += reference

		return connection
	}
	
}