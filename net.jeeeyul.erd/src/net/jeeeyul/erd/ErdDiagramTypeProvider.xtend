package net.jeeeyul.erd

import com.google.inject.Guice
import com.google.inject.Injector
import java.util.ArrayList
import net.jeeeyul.erd.tool.ToolBehaviorProvider
import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider
import org.eclipse.graphiti.tb.IToolBehaviorProvider

class ErdDiagramTypeProvider extends AbstractDiagramTypeProvider {
	extension Injector injector
	
	ArrayList<IToolBehaviorProvider> availableToolBehaviorProviders
	
	new() {
		var module = new net.jeeeyul.erd.ErdModule()
		module.provider = this
		injector = Guice::createInjector(module)
		setFeatureProvider(typeof(ErdDiagramFeatureProvider).instance)
	}
	
	override getAvailableToolBehaviorProviders() {
		if(availableToolBehaviorProviders == null){
			availableToolBehaviorProviders = new ArrayList<IToolBehaviorProvider> =>[
				add(typeof(ToolBehaviorProvider).instance)
			]			
		}
		availableToolBehaviorProviders
	}
	
	def Injector getInjector(){
		return injector
	}
}