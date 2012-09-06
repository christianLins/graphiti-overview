package net.jeeeyul.erd

import org.eclipse.graphiti.ui.features.DefaultFeatureProvider
import org.eclipse.graphiti.dt.IDiagramTypeProvider
import com.google.inject.Inject
import net.jeeeyul.erd.module.IErdExtensions

abstract class  BaseFeatureProvider extends DefaultFeatureProvider {
	@Inject extension IErdExtensions
	
	@Inject
	new(IDiagramTypeProvider dtp) {
		super(dtp)
	}
	
	def <T> getSingleTone(Class<T> type){
		return type.createSingleTone() as T
	}
	
	def private Object create type.createInstance createSingleTone(Class type){
		println("An instance has been created for " + type.name)
	}

}