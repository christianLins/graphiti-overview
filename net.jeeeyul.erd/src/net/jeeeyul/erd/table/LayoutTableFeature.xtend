package net.jeeeyul.erd.table

import com.google.inject.Inject
import net.jeeeyul.erd.model.erd.Table
import net.jeeeyul.erd.module.IErdExtensions
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.ILayoutContext
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature
import org.eclipse.graphiti.mm.algorithms.Polyline
import org.eclipse.graphiti.mm.algorithms.Text
import org.eclipse.graphiti.mm.pictograms.ContainerShape
import org.eclipse.graphiti.services.IGaService

class LayoutTableFeature extends AbstractLayoutFeature {
	@Inject extension IGaService
	@Inject extension IErdExtensions
	
	@Inject
	new(IFeatureProvider fp) {
		super(fp)
	}
	
	override canLayout(ILayoutContext context) {
		context.pictogramElement.businessObjectForPictogramElement instanceof Table && context.pictogramElement.tag == "table-root"
	}
	
	override layout(ILayoutContext context) {
		var rootShape = context.pictogramElement as ContainerShape
		var rootGa = rootShape.graphicsAlgorithm
		
		rootShape.getShapeByTag("table-icon").graphicsAlgorithm.setLocationAndSize(3, 0, 20, 20)
		
		var text = rootShape.getShapeByTag("table-title").graphicsAlgorithm as Text
		text.setLocationAndSize(24, 0, rootGa.width - 24, 20)
		
		var splitter = rootShape.getShapeByTag("table-splitter").graphicsAlgorithm as Polyline
		splitter.points.head.x = 0
		splitter.points.head.y = 20
		splitter.points.last.x = rootGa.width
		splitter.points.last.y = 20
		

		var columns = rootShape.getAllShapes.filter[it.tag == "column-root"].toList
		var y = 20
		for(each : columns){
			each.graphicsAlgorithm.setLocationAndSize(5, y, rootGa.width - 10, 20);
			y = y + 20;
		}
		
		if(rootGa.height < y+5){
			rootGa.height = y+5;
		}
		return true
	}
	
}