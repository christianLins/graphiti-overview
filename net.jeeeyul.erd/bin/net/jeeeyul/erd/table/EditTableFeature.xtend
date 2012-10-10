package net.jeeeyul.erd.table

import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.IDirectEditingContext
import net.jeeeyul.erd.model.erd.Table
import com.google.inject.Inject
import org.eclipse.graphiti.features.context.IContext

class EditTableFeature extends AbstractDirectEditingFeature {
	@Inject
	new(IFeatureProvider fp) {
		super(fp)
	}
	
	override getEditingType() {
		TYPE_TEXT
	}
	
	override canExecute(IContext context) {
		super.canExecute(context)
	}
	
	override setValue(String value, IDirectEditingContext context) {
		var table = context.pictogramElement.businessObjectForPictogramElement as Table
		table.setName(value.trim)
		
		updatePictogramElement(context.pictogramElement)
	}
	
	override canUndo(IContext context) {
		super.canUndo(context)
	}
	
	override getInitialValue(IDirectEditingContext context) {
		var table = context.pictogramElement.businessObjectForPictogramElement as Table
		return table.name
	}
}