package net.jeeeyul.erd.module;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.features.context.IContext;

public interface IDomainModelExtensions {
	public Resource getDomainResource(IContext context);
}
