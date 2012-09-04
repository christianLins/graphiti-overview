package net.jeeeyul.erd.relation

import com.google.inject.Inject
import net.jeeeyul.erd.model.erd.TableRefererence
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.IDirectEditingContext
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature
import net.jeeeyul.erd.module.IErdExtensions

import static org.eclipse.graphiti.func.IDirectEditing.*

class EditRelationNameFeature extends AbstractDirectEditingFeature {
	@Inject extension IErdExtensions
	
	@Inject
	new(IFeatureProvider fp) {
		super(fp)
	}

	override canDirectEdit(IDirectEditingContext context) {
		context.pictogramElement.businessObjectForPictogramElement instanceof TableRefererence &&
		context.pictogramElement.tag == "relation-text"
	}

	override setValue(String value, IDirectEditingContext context) {
		var tableReference = context.pictogramElement.businessObjectForPictogramElement as TableRefererence
		tableReference.setName(value.trim)
	}
	
	override getEditingType() {
		TYPE_TEXT
	}

	override getInitialValue(IDirectEditingContext context) {
		var tableReference = context.pictogramElement.businessObjectForPictogramElement as TableRefererence
		return tableReference.name.nullSafeString
	}
	
	def nullSafeString(String str){
		if(str == null){
			""
		}else{
			str
		}
	}
}