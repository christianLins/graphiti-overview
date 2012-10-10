package net.jeeeyul.erd.column

import org.eclipse.graphiti.features.impl.AbstractAddFeature
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.IAddContext
import com.google.inject.Inject
import net.jeeeyul.erd.module.IErdExtensions
import net.jeeeyul.erd.model.erd.Column
import org.eclipse.graphiti.services.ILinkService
import org.eclipse.graphiti.features.context.impl.AddContext
import org.eclipse.graphiti.mm.pictograms.ContainerShape

class AddColumnOnColumnFeature extends AbstractAddFeature{
	@Inject extension IErdExtensions
	@Inject ILinkService linkService
	
	@Inject
	new(IFeatureProvider fp) {
		super(fp)
	}
	
	override add(IAddContext context) {
		var col = context.targetContainer.businessObjectForPictogramElement as Column
		val tablePE = linkService.getPictogramElements(diagram, col.eContainer).findFirst[it.tag == "table-root"] as ContainerShape
		
		var ac = new AddContext() => [
			targetContainer = tablePE
			newObject = context.newObject
		]
		
		return featureProvider.getAddFeature(ac).add(ac)
		
	}
	
	override canAdd(IAddContext context) {
		context.targetContainer.tag == "column-root"
	}
}