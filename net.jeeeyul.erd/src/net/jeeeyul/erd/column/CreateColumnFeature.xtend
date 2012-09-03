package net.jeeeyul.erd.column

import com.google.inject.Inject
import java.util.UUID
import net.jeeeyul.erd.model.erd.ErdFactory
import net.jeeeyul.erd.model.erd.Table
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.ICreateContext
import org.eclipse.graphiti.features.impl.AbstractCreateFeature
import net.jeeeyul.erd.SharedImages

class CreateColumnFeature extends AbstractCreateFeature {
	@Inject
	new(IFeatureProvider fp) {
		super(fp, "Column", "Adds a new column")
	}
	
	override getCreateImageId() {
		SharedImages$ICON16::FIELD
	}
	
	override canCreate(ICreateContext context) {
		context.targetContainer.businessObjectForPictogramElement instanceof Table
	}
	
	override create(ICreateContext context) {
		var column = ErdFactory::eINSTANCE.createColumn =>[
			it.name = "New Column";
			uuid = UUID::randomUUID.toString
		]
		
		var table = context.targetContainer.businessObjectForPictogramElement as Table
		table.columns.add(column)
		context.addGraphicalRepresentation(column)

		return newArrayList(column)
	}
	
}