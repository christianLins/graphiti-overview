package net.jeeeyul.erd.relation

import org.eclipse.graphiti.features.impl.AbstractUpdateFeature
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.IUpdateContext
import com.google.inject.Inject
import net.jeeeyul.erd.module.IErdExtensions
import net.jeeeyul.erd.model.erd.TableRefererence
import org.eclipse.graphiti.mm.algorithms.Text
import org.eclipse.graphiti.features.impl.Reason

class UpdateRelationNameFeature extends AbstractUpdateFeature {
	@Inject extension IErdExtensions
	
	@Inject
	new(IFeatureProvider fp) {
		super(fp)
	}

	override canUpdate(IUpdateContext context) {
		context.pictogramElement.businessObjectForPictogramElement instanceof TableRefererence
	}

	override update(IUpdateContext context) {
		var ref = context.pictogramElement.businessObjectForPictogramElement as TableRefererence
		
		switch(context.pictogramElement.tag){
			case "text" :{
				var text = context.pictogramElement.graphicsAlgorithm as Text
				text.value = ref.name
			}
			
			case "source-cardinality":{
				var text = context.pictogramElement.graphicsAlgorithm as Text
				text.value = ref.sourceCardinality.literal
			}
			
			case "target-cardinality":{
				var text = context.pictogramElement.graphicsAlgorithm as Text
				text.value = ref.targetCardinality.literal
			}
			
			default:
				Reason::createFalseReason
		}
		
		return true
	}

	override updateNeeded(IUpdateContext context) {
		var ref = context.pictogramElement.businessObjectForPictogramElement as TableRefererence
	
		switch(context.pictogramElement.tag){
			case "text" :{
				var text = context.pictogramElement.graphicsAlgorithm as Text
				if(ref.name != text.value){
					Reason::createTrueReason("Reference name was changed")
				}
				else{
					Reason::createFalseReason
				}
			}
			
			case "source-cardinality":{
				var text = context.pictogramElement.graphicsAlgorithm as Text
				if(ref.sourceCardinality.literal != text.value){
					Reason::createTrueReason("Source Cardinality was changed")
				}
				else{
					Reason::createFalseReason
				}
			}
			
			case "target-cardinality":{
				var text = context.pictogramElement.graphicsAlgorithm as Text
				if(ref.targetCardinality.literal != text.value){
					Reason::createTrueReason("Target Cardinality was changed")
				}
				else{
					Reason::createFalseReason
				}
			}
			
			default:
				Reason::createFalseReason
		}
	}
}