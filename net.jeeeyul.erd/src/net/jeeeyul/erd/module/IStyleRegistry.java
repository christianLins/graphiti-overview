package net.jeeeyul.erd.module;

import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public interface IStyleRegistry {
	public Style getStyle(Diagram diagram, String styleId,
			Procedure1<Style> initialize);
}
