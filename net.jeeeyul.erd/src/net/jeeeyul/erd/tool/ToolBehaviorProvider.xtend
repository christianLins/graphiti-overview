package net.jeeeyul.erd.tool

import com.google.inject.Inject
import org.eclipse.graphiti.dt.IDiagramTypeProvider
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider
import net.jeeeyul.erd.ErdDiagramTypeProvider
import org.eclipse.graphiti.mm.pictograms.PictogramElement
import org.eclipse.graphiti.util.ILocationInfo
import org.eclipse.graphiti.services.ILinkService
import net.jeeeyul.erd.model.erd.Table
import net.jeeeyul.erd.module.IErdExtensions
import org.eclipse.graphiti.util.LocationInfo
import org.eclipse.graphiti.mm.pictograms.Shape

class ToolBehaviorProvider extends DefaultToolBehaviorProvider {
	@Inject extension IErdExtensions
	@Inject extension ILinkService 
	
	@Inject
	new(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider)
	}
	
	
	def <T> T getInstance(Class<T> type){
		(diagramTypeProvider as ErdDiagramTypeProvider).injector.getInstance(type)
	}
	
	override getLocationInfo(PictogramElement pe, ILocationInfo locationInfo) {
		if(pe.businessObjectForLinkedPictogramElement instanceof Table){
			var table = pe.businessObjectForLinkedPictogramElement as Table
			var pes = diagramTypeProvider.diagram.getPictogramElements(table)
			var titleShape = pes.findFirst[it.tag == "title"]
			return new LocationInfo(titleShape as Shape, titleShape.graphicsAlgorithm)
		}
		return locationInfo
	}
	
}