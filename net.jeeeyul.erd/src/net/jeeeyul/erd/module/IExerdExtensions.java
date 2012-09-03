package net.jeeeyul.erd.module;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import com.google.inject.ImplementedBy;

@ImplementedBy(ExerdExtensionsImpl.class)
public interface IExerdExtensions {
	public String getTag(PictogramElement pe);
	public void setTag(PictogramElement pe, String tag);
	public TreeIterator<Shape> getAllShapes(PictogramElement pe);
	public TreeIterator<Shape> getAllShapes(PictogramElement pe, boolean includeRoot);
	public Shape getShapeByTag(Shape root, String tag);
	public <T> T createInstance(Class<T> type);
}
