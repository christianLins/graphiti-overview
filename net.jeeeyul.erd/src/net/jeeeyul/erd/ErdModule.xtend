package net.jeeeyul.erd

import com.google.inject.AbstractModule
import com.google.inject.Provides
import com.google.inject.Singleton
import net.jeeeyul.erd.module.DomainModelExtensionsImpl
import net.jeeeyul.erd.module.StyleRegistryImpl
import org.eclipse.graphiti.dt.IDiagramTypeProvider
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.services.Graphiti
import org.eclipse.graphiti.services.IGaCreateService
import org.eclipse.graphiti.services.IGaService
import org.eclipse.graphiti.services.ILinkService
import org.eclipse.graphiti.services.IPeCreateService
import org.eclipse.graphiti.services.IPeService
import org.eclipse.xtend.lib.Property
import net.jeeeyul.erd.module.IStyleRegistry
import net.jeeeyul.erd.module.IDomainModelExtensions

class ErdModule extends AbstractModule {
	@Property ErdDiagramTypeProvider provider;
	
	override protected configure() {
		bind(typeof(IDiagramTypeProvider)).toInstance(provider)
		
		bind(typeof(ILinkService)).toInstance(Graphiti::linkService)
		bind(typeof(IPeService)).toInstance(Graphiti::peService)
		bind(typeof(IPeCreateService)).toInstance(Graphiti::peCreateService)
		bind(typeof(IGaService)).toInstance(Graphiti::gaService)
		bind(typeof(IGaCreateService)).toInstance(Graphiti::gaCreateService)
		bind(typeof(IStyleRegistry)).to(typeof(StyleRegistryImpl)).in(typeof(Singleton))
		bind(typeof(IDomainModelExtensions)).to(typeof(DomainModelExtensionsImpl)).in(typeof(Singleton))
		bind(typeof(ErdModule)).toInstance(this)
	}
	
	@Provides
	def IFeatureProvider provideFeatureProvider(){
		return provider.featureProvider
	}
}