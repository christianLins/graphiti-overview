package net.jeeeyul.erd.module

import org.eclipse.graphiti.mm.algorithms.styles.Style
import org.eclipse.xtext.xbase.lib.Procedures$Procedure1
import org.eclipse.graphiti.mm.pictograms.Diagram
import org.eclipse.graphiti.services.IGaService
import com.google.inject.Inject

class StyleRegistryImpl implements IStyleRegistry{
	@Inject extension IGaService

	override getStyle(Diagram diagram, String styleId, Procedure1<Style> initialize) {
		var result = findStyle(diagram, styleId)
		if(result == null){
			result = createPlainStyle(diagram, styleId)
			initialize.apply(result)
		}
		return result
	}
	
}