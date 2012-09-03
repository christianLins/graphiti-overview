package net.jeeeyul.erd.table

import com.google.inject.Inject
import net.jeeeyul.erd.module.IExerdExtensions
import net.jeeeyul.erd.module.IStyleRegistry
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.IAddContext
import org.eclipse.graphiti.features.impl.AbstractAddFeature
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle
import org.eclipse.graphiti.mm.algorithms.styles.Orientation
import org.eclipse.graphiti.mm.pictograms.Diagram
import org.eclipse.graphiti.services.IGaService
import org.eclipse.graphiti.services.IPeService
import org.eclipse.graphiti.util.PredefinedColoredAreas
import net.jeeeyul.erd.model.erd.Table

class AddTableFeature extends AbstractAddFeature {
	@Inject	extension IExerdExtensions
	@Inject extension IPeService
	@Inject	extension IGaService
	@Inject extension IStyleRegistry 
	
	@Inject
	new(IFeatureProvider fp) {
		super(fp)
	}
	
	override add(IAddContext context) {
		val table = context.newObject as Table
		
		val width = if(context.width != -1) context.width else 100
		val height = if(context.height != -1) context.height else 40 
		
		var containerShape = createContainerShape(context.targetContainer, true) =>[
			createPlainRoundedRectangle(15, 15) => [
				style = getStyle(context.targetContainer as Diagram, "table")[
					it.setRenderingStyle(PredefinedColoredAreas::blueWhiteGlossAdaptions)
					it.lineWidth = 2
				]
				setLocationAndSize(context.x, context.y, width, height)
			]
			
			createShape(false) => [
				createText => [
					it.value = table.name
					horizontalAlignment = Orientation::ALIGNMENT_CENTER
					lineVisible = false
				]
				link(table)
				it.tag = "title"
			]
			
			createShape(false) =>[
				createPolyline(newArrayList(0, 20, 0, 20) as int[]) => [
					it.lineStyle = LineStyle::DASH
				]
				it.tag = "splitter"
			]
			
			createContainerShape(false) => [
				it.tag = "column-container"
				createInvisibleRectangle()
			]
	
			createChopboxAnchor()
						
			link(table)
		]
		
		updatePictogramElement(containerShape)
		layoutPictogramElement(containerShape)
		
		return containerShape
	}
	
	override canAdd(IAddContext context) {
		context.targetContainer instanceof Diagram && context.newObject instanceof Table
	}
}