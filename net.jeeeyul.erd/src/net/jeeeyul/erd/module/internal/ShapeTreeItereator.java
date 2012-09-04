package net.jeeeyul.erd.module.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

public class ShapeTreeItereator extends AbstractTreeIterator<PictogramElement> {
	private static final long serialVersionUID = 7508511063803727569L;

	public ShapeTreeItereator(Object object, boolean includeRoot) {
		super(object, includeRoot);
	}

	@Override
	protected Iterator<? extends PictogramElement> getChildren(Object object) {
		List<PictogramElement> result = new ArrayList<PictogramElement>();
		
		if (object instanceof ContainerShape) {
			result.addAll(((ContainerShape) object).getChildren());
		}
		
		if(object instanceof Connection){
			result.addAll(((Connection) object).getConnectionDecorators());
		}
		
		return result.iterator();
	}
}
