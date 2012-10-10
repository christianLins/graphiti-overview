package net.jeeeyul.erd

import com.google.inject.Guice
import com.google.inject.Injector
import java.util.ArrayList
import net.jeeeyul.erd.tool.ToolBehaviorProvider
import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider
import org.eclipse.graphiti.tb.IToolBehaviorProvider
import net.jeeeyul.erd.module.ErdModule

class ErdDiagramTypeProvider extends AbstractDiagramTypeProvider {
	extension Injector injector
	
	ArrayList<IToolBehaviorProvider> availableToolBehaviorProviders
	
	new() {
		var module = new ErdModule()
		module.provider = this
		injector = Guice::createInjector(module)
		setFeatureProvider(typeof(ErdFeatureProvider).instance)
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