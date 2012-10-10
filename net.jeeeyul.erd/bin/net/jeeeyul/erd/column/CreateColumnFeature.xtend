package net.jeeeyul.erd.column

import com.google.inject.Inject
import java.util.UUID
import net.jeeeyul.erd.model.erd.ErdFactory
import net.jeeeyul.erd.model.erd.Table
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.ICreateContext
import org.eclipse.graphiti.features.impl.AbstractCreateFeature
import net.jeeeyul.erd.SharedImages
import net.jeeeyul.erd.module.IErdExtensions
import net.jeeeyul.erd.model.erd.Column

class CreateColumnFeature extends AbstractCreateFeature {
	@Inject extension IErdExtensions
	@Inject
	new(IFeatureProvider fp) {
		super(fp, "Column", "Adds a new column")
	}
	
	override getCreateImageId() {
		SharedImages$ICON16::FIELD
	}
	
	override canCreate(ICreateContext context) {
		context.targetContainer.tag == "table-root" ||
		context.targetContainer.tag == "column-root"
	}
	
	override create(ICreateContext context) {
		var column = ErdFactory::eINSTANCE.createColumn =>[
			it.name = "New Column";
			uuid = UUID::randomUUID.toString
		]
		
		var bo = context.targetContainer.businessObjectForPictogramElement;
		var Table table = null
	
		switch(bo){
			Table:
				table = bo
			
			Column:
				table = bo.eContainer as Table
		}
		
		table.columns.add(column)
		
		val colShape = context.addGraphicalRepresentation(column)
		
		featureProvider.directEditingInfo => [
			active = true
			mainPictogramElement = colShape
			pictogramElement = colShape
			graphicsAlgorithm = colShape.graphicsAlgorithm
		]

		return newArrayList(column)
	}
	
}