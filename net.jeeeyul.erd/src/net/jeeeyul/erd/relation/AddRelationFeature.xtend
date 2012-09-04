package net.jeeeyul.erd.relation

import com.google.inject.Inject
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.IAddConnectionContext
import org.eclipse.graphiti.features.context.IAddContext
import org.eclipse.graphiti.features.impl.AbstractAddFeature
import org.eclipse.graphiti.services.IGaCreateService
import org.eclipse.graphiti.services.IPeCreateService
import net.jeeeyul.erd.model.erd.TableRefererence
import net.jeeeyul.erd.module.IErdExtensions

class AddRelationFeature extends AbstractAddFeature {
	@Inject extension IPeCreateService
	@Inject extension IGaCreateService
	@Inject extension IErdExtensions
	
	@Inject
	new(IFeatureProvider fp) {
		super(fp)
	}
	
	override add(IAddContext context) {
		val acc = context as IAddConnectionContext
		val reference = acc.newObject as TableRefererence
		
		var con = diagram.createFreeFormConnection => [
			start = acc.sourceAnchor
			end = acc.targetAnchor
			
			createPolyline => [
				lineWidth = 2
			]
			tag = "relation-root"
			
			createConnectionDecorator(true, 0.5, true) => [
				createText => [
					value = reference.name
				]
				link(acc.newObject)
				tag = "relation-text"
			]
			
			createConnectionDecorator(true, 0.1, true) => [
				createText => [
					value = reference.sourceCardinality.literal
				]
				link(acc.newObject)
				tag = "relation-source-cardinality"
			]
			
			createConnectionDecorator(true, 0.9, true) => [
				createText => [
					value = reference.targetCardinality.literal
				]
				link(acc.newObject)
				tag = "relation-target-cardinality"
			]
			
			createConnectionDecorator(false, 1.0, true) => [
				createPlainPolyline(newArrayList(
					-10, 7, 0, 0, -10, -7
				) as int[]) => [
					lineWidth = 2
				]
				link(acc.newObject)
			]
			
			link(acc.newObject)
		]
		
		
		return con
		
	}
	
	override canAdd(IAddContext context) {
		if(context instanceof IAddConnectionContext){
			var acc = context as IAddConnectionContext
			return acc.newObject instanceof TableRefererence
		}
		
		return false
	}
	
}