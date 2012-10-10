package net.jeeeyul.erd.module.internal

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.graphiti.features.context.ICreateConnectionContext
import org.eclipse.graphiti.features.context.ICreateContext
import net.jeeeyul.erd.module.IDomainModelExtensions

class DomainModelExtensionsImpl implements IDomainModelExtensions{
	def dispatch Resource getDomainResource(ICreateContext context){
		context.targetContainer.eResource.modelResource
	}
	
	def dispatch Resource getDomainResource(ICreateConnectionContext context){
		if(context.sourcePictogramElement != null){
			context.sourcePictogramElement.eResource.modelResource
		}else{
			println("부모가 지정되지 않음!")
			null
		}
	}
	
	def private getModelResource(Resource diagramResource){
		var fileName = diagramResource.URI.trimFileExtension.lastSegment
		var modelURI = diagramResource.URI.trimSegments(1).appendSegment(fileName + ".model")
		
		var modelResource = diagramResource.resourceSet.getResource(modelURI, false)
		if(modelResource == null){
			modelResource = diagramResource.resourceSet.createResource(modelURI)
		}
		return modelResource
	}
}