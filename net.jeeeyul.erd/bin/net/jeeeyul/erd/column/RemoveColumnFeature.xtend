package net.jeeeyul.erd.column

import com.google.inject.Inject
import net.jeeeyul.erd.module.IErdExtensions
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.IRemoveContext
import org.eclipse.graphiti.features.impl.DefaultRemoveFeature
import org.eclipse.graphiti.mm.pictograms.PictogramElement

class RemoveColumnFeature extends DefaultRemoveFeature {
	@Inject extension IErdExtensions
	
	private PictogramElement tablePE
	
	@Inject	
	new(IFeatureProvider fp) {
		super(fp)
	}
	
	override preRemove(IRemoveContext context) {
		tablePE = context.pictogramElement.findContainerByTag("table-root")
	}
	
	override postRemove(IRemoveContext context) {
		if(tablePE != null){
			tablePE.layoutPictogramElement()
		}
	}
}