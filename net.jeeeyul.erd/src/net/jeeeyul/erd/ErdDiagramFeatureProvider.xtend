package net.jeeeyul.erd

import com.google.inject.Inject
import net.jeeeyul.erd.column.AddColumnFeature
import net.jeeeyul.erd.column.CreateColumnFeature
import net.jeeeyul.erd.common.RemovedModelUpdateFeature
import net.jeeeyul.erd.model.erd.Column
import net.jeeeyul.erd.model.erd.Table
import net.jeeeyul.erd.model.erd.TableRefererence
import net.jeeeyul.erd.module.IErdExtensions
import net.jeeeyul.erd.relation.AddRelationFeature
import net.jeeeyul.erd.relation.CreateRelationFeatue
import net.jeeeyul.erd.relation.EditRelationNameFeature
import net.jeeeyul.erd.table.AddTableFeature
import net.jeeeyul.erd.table.CreateTableFeature
import net.jeeeyul.erd.table.LayoutTableFeature
import net.jeeeyul.erd.table.UpdateTableFeature
import org.eclipse.graphiti.dt.IDiagramTypeProvider
import org.eclipse.graphiti.features.context.IAddConnectionContext
import org.eclipse.graphiti.features.context.IAddContext
import org.eclipse.graphiti.features.context.IDirectEditingContext
import org.eclipse.graphiti.features.context.ILayoutContext
import org.eclipse.graphiti.features.context.IMoveShapeContext
import org.eclipse.graphiti.features.context.IResizeShapeContext
import org.eclipse.graphiti.features.context.IUpdateContext
import org.eclipse.graphiti.mm.pictograms.Diagram
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider
import net.jeeeyul.erd.relation.UpdateRelationNameFeature
import net.jeeeyul.erd.relation.EditCardinalityFeature
import net.jeeeyul.erd.table.EditTableFeature
import net.jeeeyul.erd.column.EditColumnFeature
import net.jeeeyul.erd.column.UpdateColumnFeature

class ErdDiagramFeatureProvider extends DefaultFeatureProvider {
	@Inject extension IErdExtensions
	
	@Inject
	new(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider)
	}
	
	override getCreateFeatures() {
		return newArrayList(
			typeof(CreateTableFeature).createInstance, 
			typeof(CreateColumnFeature).createInstance
		)
	}
	
	override getCreateConnectionFeatures() {
		return newArrayList(typeof(CreateRelationFeatue).createInstance)
	}
	
	override getAddFeature(IAddContext context) {
		switch(context){
			case context.targetContainer instanceof Diagram && context.newObject instanceof Table:
				typeof(AddTableFeature).createInstance
				
			case context.targetContainer.businessObjectForPictogramElement instanceof Table && context.newObject instanceof Column:
				typeof(AddColumnFeature).createInstance
			
			case context instanceof IAddConnectionContext && context.newObject instanceof TableRefererence:
				typeof(AddRelationFeature).createInstance
			
			default:
				super.getAddFeature(context)
		}
	}
	
	override getResizeShapeFeature(IResizeShapeContext context) {
		switch(context.pictogramElement.businessObjectForPictogramElement){
			Column:
				null
				
			default:
				super.getResizeShapeFeature(context)
		}
	}
	
	override getMoveShapeFeature(IMoveShapeContext context) {
		switch(context.pictogramElement.businessObjectForPictogramElement){
			Column:
				null
				
			default:
				super.getMoveShapeFeature(context)
		}
	}
	
	override getUpdateFeature(IUpdateContext context) {
		switch(context.pictogramElement.businessObjectForPictogramElement){
			Column:
				typeof(UpdateColumnFeature).createInstance
				
			Table:
				typeof(UpdateTableFeature).createInstance
				
			TableRefererence:
				typeof(UpdateRelationNameFeature).createInstance
				
			default:
				typeof(RemovedModelUpdateFeature).createInstance
		}
	}
	
	override getLayoutFeature(ILayoutContext context) {
		switch(context.pictogramElement.businessObjectForPictogramElement){
			Table:
				typeof(LayoutTableFeature).createInstance
				
			default:
				super.getLayoutFeature(context)
		}
	}
	
	override getDirectEditingFeature(IDirectEditingContext context) {
		var bo = context.pictogramElement.businessObjectForPictogramElement
		
		switch(bo){
			Column:
				typeof(EditColumnFeature).createInstance
			
			Table:
				typeof(EditTableFeature).createInstance
				
			TableRefererence case context.pictogramElement.tag == "relation-text":
				typeof(EditRelationNameFeature).createInstance
				
			TableRefererence case context.pictogramElement.tag == "relation-source-cardinality":
				typeof(EditCardinalityFeature).createInstance	
				
			TableRefererence case context.pictogramElement.tag == "relation-target-cardinality":
				typeof(EditCardinalityFeature).createInstance	
					
			default:
				super.getDirectEditingFeature(context)
		}
	}
}
