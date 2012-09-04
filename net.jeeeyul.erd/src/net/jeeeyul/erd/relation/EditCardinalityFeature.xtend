package net.jeeeyul.erd.relation

import com.google.inject.Inject
import net.jeeeyul.erd.model.erd.TableRefererence
import net.jeeeyul.erd.module.IErdExtensions
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.IDirectEditingContext
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature

import static org.eclipse.graphiti.func.IDirectEditing.*
class EditCardinalityFeature extends AbstractDirectEditingFeature {
	@Inject extension IErdExtensions
	
	@Inject
	new(IFeatureProvider fp) {
		super(fp)
	}
	
	override getEditingType() {
		TYPE_DROPDOWN_READ_ONLY
	}
	
	override getPossibleValues(IDirectEditingContext context) {
		cardinalites.map[it.name]
	}
	
	override setValue(String value, IDirectEditingContext context) {
		var isSource = context.pictogramElement.tag == "source-cardinality"
		var ref = context.pictogramElement.businessObjectForPictogramElement as TableRefererence
		
		if(isSource){
			ref.sourceCardinality = getCardinalityWithName(value)
		}else{
			ref.targetCardinality = getCardinalityWithName(value)
		}
	}
	
	override getInitialValue(IDirectEditingContext context) {
		var isSource = context.pictogramElement.tag == "source-cardinality"
		var ref = context.pictogramElement.businessObjectForPictogramElement as TableRefererence
		if(isSource){
			ref.sourceCardinality.name
		}
		else{
			ref.targetCardinality.name
		}
	}
	
}