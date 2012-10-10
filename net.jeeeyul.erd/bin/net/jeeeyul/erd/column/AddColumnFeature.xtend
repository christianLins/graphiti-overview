package net.jeeeyul.erd.column

import org.eclipse.graphiti.features.impl.AbstractAddFeature
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.IAddContext
import com.google.inject.Inject
import net.jeeeyul.erd.model.erd.Table
import org.eclipse.graphiti.services.IPeCreateService
import org.eclipse.graphiti.services.IGaService
import org.eclipse.graphiti.mm.pictograms.ContainerShape
import net.jeeeyul.erd.model.erd.Column
import net.jeeeyul.erd.module.IErdExtensions

class AddColumnFeature extends AbstractAddFeature {
	@Inject extension IErdExtensions
	@Inject extension IPeCreateService
	@Inject extension IGaService
	
	@Inject
	new(IFeatureProvider fp) {
		super(fp)
	}
	
	override add(IAddContext context) {
		val table = context.targetContainer.businessObjectForPictogramElement as Table
		val column = context.newObject as Column
		var containerShape = context.targetContainer.getShapeByTag("table-root") as ContainerShape
		var columnShape = containerShape.createContainerShape(true) => [
			tag = "column-root"
			createText => [
				value = column.name
			]
			link(column)
		]
		
		table.columns += column
		layoutPictogramElement(context.targetContainer)
		
		return columnShape;
	}
	
	override canAdd(IAddContext context) {
		context.targetContainer.businessObjectForPictogramElement instanceof Table
	}
}