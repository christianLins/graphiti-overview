package net.jeeeyul.erd.common

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.IUpdateContext
import org.eclipse.graphiti.features.context.impl.RemoveContext
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature
import org.eclipse.graphiti.features.impl.Reason

class RemovedModelUpdateFeature extends AbstractUpdateFeature {
	@Inject
	new(IFeatureProvider fp) {
		super(fp)
	}
	
	override canUpdate(IUpdateContext context) {
		if(context.pictogramElement.active && context.pictogramElement.businessObjectForPictogramElement == null){
			return true
		}
		if(context.pictogramElement.businessObjectForPictogramElement instanceof EObject){
			return (context.pictogramElement.businessObjectForPictogramElement as EObject).eIsProxy
		}
		return false
	}
	
	override update(IUpdateContext context) {
		var rc = new RemoveContext(context.pictogramElement)
		var removeFeature = featureProvider.getRemoveFeature(rc)
		if(removeFeature != null && removeFeature.canExecute(rc)){
			removeFeature.execute(rc)
			return true
		}
		false
	}
	
	override updateNeeded(IUpdateContext context) {
		if(!context.pictogramElement.active){
			return Reason::createFalseReason
		}
		
		var model = context.pictogramElement.businessObjectForPictogramElement as EObject
		if(model == null || model.eIsProxy)
			return Reason::createTrueReason("Business model was removed or can't resolve.")
		else
			return Reason::createFalseReason
	}
	
}