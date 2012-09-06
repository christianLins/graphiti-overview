package net.jeeeyul.erd.module.internal;

import java.util.HashMap;
import java.util.Map;

import net.jeeeyul.erd.model.erd.Cardinality;
import net.jeeeyul.erd.module.ErdModule;
import net.jeeeyul.erd.module.IErdExtensions;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.graphiti.mm.Property;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.IPeService;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class ErdExtensionsImpl implements IErdExtensions {
	@Inject
	private IPeService peService;

	@Inject
	private ErdModule module;

	private Injector injector;

	private Map<Class<?>, Object> instanceCache = new HashMap<Class<?>, Object>();

	@Override
	public <T> T createInstance(Class<T> type) {
		return getInjector().getInstance(type);
	}

	public TreeIterator<PictogramElement> getAllShapes(PictogramElement pe) {
		return getAllShapes(pe, true);
	}

	public TreeIterator<PictogramElement> getAllShapes(PictogramElement pe,
			boolean includeRoot) {
		return new ShapeTreeItereator(pe, includeRoot);
	}

	@Override
	public Cardinality[] getCardinalites() {
		return Cardinality.values();
	}

	@Override
	public Cardinality getCardinalityWithName(String name) {
		return Cardinality.getByName(name);
	}

	public Injector getInjector() {
		if (injector == null) {
			injector = Guice.createInjector(module);
		}
		return injector;
	}

	@Override
	public PictogramElement getShapeByTag(PictogramElement root, String tag) {
		TreeIterator<PictogramElement> iter = getAllShapes(root, true);
		while (iter.hasNext()) {
			PictogramElement next = iter.next();
			if (tag.equals(getTag(next))) {
				return next;
			}
		}
		return null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> T getSingleTone(Class<T> type) {
		Object object = instanceCache.get(type);
		if (object == null) {
			object = getInjector().getInstance(type);
			instanceCache.put(type, object);
		}
		return (T) object;
	}

	@Override
	public String getTag(PictogramElement pe) {
		Property property = peService.getProperty(pe, "tag");
		return property != null ? property.getValue() : null;
	}

	@Override
	public void setTag(PictogramElement pe, String value) {
		peService.setPropertyValue(pe, "tag", value);
	}
}
