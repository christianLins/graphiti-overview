package net.jeeeyul.erd.module;

import net.jeeeyul.erd.ExerdModule;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.graphiti.mm.Property;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.IPeService;

import com.google.inject.Guice;
import com.google.inject.Inject;

public class ExerdExtensionsImpl implements IExerdExtensions {
	@Inject
	private IPeService peService;

	@Inject
	private ExerdModule module;

	@Override
	public String getTag(PictogramElement pe) {
		Property property = peService.getProperty(pe, "tag");
		return property != null ? property.getValue() : null;
	}

	@Override
	public void setTag(PictogramElement pe, String value) {
		peService.setPropertyValue(pe, "tag", value);
	}

	public TreeIterator<Shape> getAllShapes(PictogramElement pe) {
		return getAllShapes(pe, true);
	}
	
	public TreeIterator<Shape> getAllShapes(PictogramElement pe, boolean includeRoot) {
		return new ShapeTreeItereator(pe, includeRoot);
	}

	@Override
	public <T> T createInstance(Class<T> type) {
		return Guice.createInjector(module).getInstance(type);
	}

	@Override
	public Shape getShapeByTag(Shape root, String tag) {
		TreeIterator<Shape> iter = getAllShapes(root, true);
		while (iter.hasNext()) {
			Shape next = iter.next();
			if (tag.equals(getTag(next))) {
				return next;
			}
		}
		return null;
	}
}
