package net.jeeeyul.erd.tool

import com.google.inject.Inject
import net.jeeeyul.erd.ErdDiagramTypeProvider
import net.jeeeyul.erd.SharedImages$ICON16
import net.jeeeyul.erd.module.IErdExtensions
import org.eclipse.graphiti.dt.IDiagramTypeProvider
import org.eclipse.graphiti.features.context.IPictogramElementContext
import org.eclipse.graphiti.features.context.impl.CreateConnectionContext
import org.eclipse.graphiti.mm.pictograms.AnchorContainer
import org.eclipse.graphiti.mm.pictograms.PictogramElement
import org.eclipse.graphiti.mm.pictograms.Shape
import org.eclipse.graphiti.services.IPeService
import org.eclipse.graphiti.tb.ContextButtonEntry
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider
import org.eclipse.graphiti.util.ILocationInfo
import org.eclipse.graphiti.util.LocationInfo
import org.eclipse.graphiti.mm.algorithms.Polyline

class ToolBehaviorProvider extends DefaultToolBehaviorProvider {
	@Inject extension IErdExtensions
	@Inject extension IPeService
	
	@Inject
	new(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider)
	}
	
	
	def <T> T getInstance(Class<T> type){
		(diagramTypeProvider as ErdDiagramTypeProvider).injector.getInstance(type)
	}
	
	override getLocationInfo(PictogramElement pe, ILocationInfo locationInfo) {
		switch(pe.tag){
			case "table-root":{
				var titleShape = pe.getShapeByTag("table-title")
				new LocationInfo(titleShape as Shape, titleShape.graphicsAlgorithm)
			}
			
			case "column-root":{
				new LocationInfo(pe as Shape, pe.graphicsAlgorithm)
			}
			
			default:
				locationInfo
		}
	}
	
	override getContextButtonPad(IPictogramElementContext context) {
		var data = super.getContextButtonPad(context)
		
		switch(context.pictogramElement.tag){
			case "column-root":
				return null
				
			case "table-root":{
				val ccc = new CreateConnectionContext => [
					it.sourcePictogramElement = context.pictogramElement
					it.sourceAnchor = (context.pictogramElement as AnchorContainer).chopboxAnchor
				]
				
				data.domainSpecificContextButtons += new ContextButtonEntry(null, context) =>[
					text = "Creates a reference"
					description = "Drag it to create a reference"
					iconId = SharedImages$ICON16::CREATE_RELATION
					addDragAndDropFeature(featureProvider.createConnectionFeatures.findFirst[it.isAvailable(ccc) && it.canStartConnection(ccc)])
				]
			}
		}
		
		return data
	}
	
	override getLineSelectionWidth(Polyline polyline) {
		polyline.lineWidth + 10
	}
	
}