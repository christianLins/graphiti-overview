package net.jeeeyul.erd.column

import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.IDirectEditingContext
import com.google.inject.Inject
import net.jeeeyul.erd.model.erd.Column

class EditColumnFeature extends AbstractDirectEditingFeature {
	@Inject
	new(IFeatureProvider fp) {
		super(fp)
	}
	override getEditingType() {
		TYPE_TEXT
	}
	
	override getInitialValue(IDirectEditingContext context) {
		var col = context.pictogramElement.businessObjectForPictogramElement as Column
		col.name
	}
	
	override setValue(String value, IDirectEditingContext context) {
		var col = context.pictogramElement.businessObjectForPictogramElement as Column
		col.name = value.trim
	}
}