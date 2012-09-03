package net.jeeeyul.erd.module;

import net.jeeeyul.erd.ErdModule;
import net.jeeeyul.erd.module.internal.ErdExtensionsImpl;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import com.google.inject.ImplementedBy;
import com.google.inject.Injector;

@ImplementedBy(ErdExtensionsImpl.class)
public interface IErdExtensions {
	/**
	 * @param pe
	 * @return tag of given {@link PictogramElement}, tag can be any string, It
	 *         is intended to specify role of view. for instance, "title-text",
	 *         "root" or something like these.
	 */
	public String getTag(PictogramElement pe);

	/**
	 * specify tag of given {@link PictogramElement}. tag can be any string, It
	 * is intended to specify role of view. for instance, "title-text", "root"
	 * or something like these.
	 * 
	 * @param pe
	 *            {@link PictogramElement} to set tag.
	 * @param tag
	 *            tag to set.
	 */
	public void setTag(PictogramElement pe, String tag);

	/**
	 * Retrieves a tree iterator for given {@link PictogramElement}.
	 * 
	 * @param pe
	 *            {@link PictogramElement} to iterate.
	 * @return an iterator for given {@link PictogramElement}.
	 */
	public TreeIterator<Shape> getAllShapes(PictogramElement pe);

	/**
	 * Retrieves a tree iterator for given {@link PictogramElement}.
	 * 
	 * @param pe
	 *            {@link PictogramElement} to iterate.
	 * @param includeRoot
	 * @return an iterator.
	 */
	public TreeIterator<Shape> getAllShapes(PictogramElement pe,
			boolean includeRoot);

	/**
	 * finds a shape with given tag, top-down search will be performed.
	 * 
	 * @param root
	 *            search context.
	 * @param tag
	 *            tag to search.
	 * @return {@link Shape} which have given tag.
	 * 
	 * @see #setTag(PictogramElement, String)
	 * @see #getTag(PictogramElement)
	 */
	public Shape getShapeByTag(Shape root, String tag);

	/**
	 * create a instance with {@link Injector} of {@link ErdModule}.
	 * 
	 * @param type
	 *            type to create an instance.
	 * @return instance.
	 */
	public <T> T createInstance(Class<T> type);
}
