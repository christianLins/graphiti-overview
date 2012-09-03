package net.jeeeyul.erd.column

import org.eclipse.graphiti.features.impl.AbstractUpdateFeature
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.IUpdateContext
import com.google.inject.Inject
import org.eclipse.graphiti.features.impl.Reason

class UpdateColumnFeature extends AbstractUpdateFeature {
	@Inject
	new(IFeatureProvider fp) {
		super(fp)
	}
	override canUpdate(IUpdateContext context) {
		true
	}
	
	override update(IUpdateContext context) {
		true
	}
	
	override updateNeeded(IUpdateContext context) {
		Reason::createFalseReason
	}
	
}