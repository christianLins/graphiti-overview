package net.jeeeyul.erd.table

import com.google.inject.Inject
import java.util.UUID
import net.jeeeyul.erd.model.erd.ErdFactory
import net.jeeeyul.erd.module.IDomainModelExtensions
import org.eclipse.graphiti.features.IFeatureProvider
import org.eclipse.graphiti.features.context.ICreateContext
import org.eclipse.graphiti.features.context.impl.AddContext
import org.eclipse.graphiti.features.impl.AbstractCreateFeature
import org.eclipse.graphiti.mm.pictograms.Diagram
import net.jeeeyul.erd.SharedImages

class CreateTableFeature extends AbstractCreateFeature {
	@Inject
	extension IDomainModelExtensions
	
	@Inject
	new(IFeatureProvider fp) {
		super(fp, "Table", "Creates a new table")
	}
	
	override getCreateImageId() {
		SharedImages$ICON16::TABLE
	}
	
	override canCreate(ICreateContext context) {
		context.targetContainer instanceof Diagram
	}
	
	override create(ICreateContext context) {
		var table = ErdFactory::eINSTANCE.createTable => [
			name = "New Table"
			uuid = UUID::randomUUID.toString
			
			columns += ErdFactory::eINSTANCE.createColumn => [
				uuid = UUID::randomUUID.toString
				name = "id"
			]
		]
		context.domainResource.contents += table
		
		var addContext = new AddContext(context, table)
		
		addContext.addGraphicalRepresentation(table)
		
		return newArrayList(table)	
	}
}