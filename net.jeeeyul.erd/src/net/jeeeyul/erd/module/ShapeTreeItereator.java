package net.jeeeyul.erd.module;

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;

public class ShapeTreeItereator extends AbstractTreeIterator<Shape> {
	private static final long serialVersionUID = 7508511063803727569L;

	public ShapeTreeItereator(Object object, boolean includeRoot) {
		super(object, includeRoot);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Iterator<? extends Shape> getChildren(Object object) {
		if (object instanceof ContainerShape) {
			return ((ContainerShape) object).getChildren().listIterator();
		}
		return Collections.EMPTY_LIST.iterator();
	}
}
