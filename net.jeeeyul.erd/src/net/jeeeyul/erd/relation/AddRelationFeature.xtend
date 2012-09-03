package net.jeeeyul.erd.relation

import com.google.inject.Inject
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.IAddConnectionContext
import org.eclipse.graphiti.features.context.IAddContext
import org.eclipse.graphiti.features.impl.AbstractAddFeature
import org.eclipse.graphiti.services.IGaCreateService
import org.eclipse.graphiti.services.IPeCreateService
import net.jeeeyul.erd.model.erd.TableRefererence

class AddRelationFeature extends AbstractAddFeature {
	@Inject extension IPeCreateService
	@Inject extension IGaCreateService
	
	@Inject
	new(IFeatureProvider fp) {
		super(fp)
	}
	
	override add(IAddContext context) {
		val acc = context as IAddConnectionContext
		
		var con = diagram.createFreeFormConnection => [
			start = acc.sourceAnchor
			end = acc.targetAnchor
			
			createPolyline => [
				lineWidth = 2
			]
			
			createConnectionDecorator(true, 0.5, true) => [
				createText => [
					value = "Hello"
				]
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