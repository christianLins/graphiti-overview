package net.jeeeyul.erd.table

import com.google.inject.Inject
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.IRemoveFeature
import org.eclipse.graphiti.features.context.IUpdateContext
import org.eclipse.graphiti.features.context.impl.AddContext
import org.eclipse.graphiti.features.context.impl.RemoveContext
import org.eclipse.graphiti.features.context.impl.UpdateContext
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature
import org.eclipse.graphiti.features.impl.Reason
import org.eclipse.graphiti.mm.algorithms.Text
import org.eclipse.graphiti.mm.pictograms.ContainerShape
import org.eclipse.graphiti.mm.pictograms.PictogramElement
import net.jeeeyul.erd.model.erd.Table
import net.jeeeyul.erd.module.IErdExtensions

class UpdateTableFeature extends AbstractUpdateFeature {
	@Inject extension IErdExtensions
	
	@Inject
	new(IFeatureProvider fp) {
		super(fp)
	}
	
	override canUpdate(IUpdateContext context) {
		context.pictogramElement.businessObjectForPictogramElement instanceof Table
	}
	
	override update(IUpdateContext context) {
		var table = context.pictogramElement.businessObjectForPictogramElement as Table
		
		switch(context.pictogramElement.tag){
			case "root":{
				var columnContainer = context.pictogramElement.getShapeByTag("column-container") as ContainerShape
		
				for(each : columnContainer.children.toArray){
					removeIfPossible(each as PictogramElement)
				}
				
				for(c : table.columns){
					var ac = new AddContext
					ac.targetContainer = context.pictogramElement as ContainerShape
					ac.newObject = c
					var af = featureProvider.getAddFeature(ac)
					af.execute(ac)
				}
				
				var text = context.pictogramElement.getShapeByTag("title").graphicsAlgorithm as Text
				text.value = table.name
			}
		}
		
		return true	
	}
	
	def removeIfPossible(PictogramElement pe) {
		var context = new RemoveContext(pe);
		val IRemoveFeature removeFeature = getFeatureProvider().getRemoveFeature(context);
		if (removeFeature != null && removeFeature.canRemove(context)) {
			removeFeature.remove(context);
			return true;
		}
		return false;
	}
	
	override updateNeeded(IUpdateContext context) {
		var table = context.pictogramElement.businessObjectForPictogramElement as Table
		
		switch(context.pictogramElement.tag){
			case "root":{
				for(eachChild : context.pictogramElement.getAllShapes(false).toList){
					var uc = new UpdateContext(eachChild)
					var uf = featureProvider.getUpdateFeature(uc)
					if(uf != null && uf.updateNeeded(uc).toBoolean){
						return uf.updateNeeded(uc)
					}
				}
			}
			
			case "title":{
				var titleText = context.pictogramElement.graphicsAlgorithm as Text
				if(titleText.value != table.name){
					return Reason::createTrueReason("Table name was changed in model")
				}
			}
		}
		
		return Reason::createFalseReason
	}
	
}