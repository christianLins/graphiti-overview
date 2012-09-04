package net.jeeeyul.erd.column

import com.google.inject.Inject
import net.jeeeyul.erd.model.erd.Column
import net.jeeeyul.erd.module.IErdExtensions
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.IUpdateContext
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature
import org.eclipse.graphiti.features.impl.Reason
import org.eclipse.graphiti.mm.algorithms.Text

class UpdateColumnFeature extends AbstractUpdateFeature {
	@Inject extension IErdExtensions

	@Inject
	new(IFeatureProvider fp) {
		super(fp)
	}

	override canUpdate(IUpdateContext context) {
		context.pictogramElement.businessObjectForPictogramElement instanceof Column
	}

	override update(IUpdateContext context) {
		var col = context.pictogramElement.businessObjectForPictogramElement as Column
	
		switch(context.pictogramElement.tag) {
			case "column-root": {
				var text = context.pictogramElement.graphicsAlgorithm as Text
				text.value = col.name
				
				true
			}
			
			default:
				false
		}
	}

	override updateNeeded(IUpdateContext context) {
		var col = context.pictogramElement.businessObjectForPictogramElement as Column
		
		switch(context.pictogramElement.tag) {
			case "column-root": {
				var text = context.pictogramElement.graphicsAlgorithm as Text
				if(text.value != col.name) {
					Reason::createTrueReason("name was changed")
				} else {
					Reason::createFalseReason
				}
			}
			
			default:
				Reason::createFalseReason
		}
	}
}