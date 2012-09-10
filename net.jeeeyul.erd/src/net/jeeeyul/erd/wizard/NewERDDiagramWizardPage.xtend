package net.jeeeyul.erd.wizard

import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.dialogs.WizardNewFileCreationPage

class NewERDDiagramWizardPage extends WizardNewFileCreationPage{
	new(String pageName, IStructuredSelection selection) {
		super(pageName, selection)
		fileExtension = "diagram"
	}
	
	override protected getInitialContents() {
		var template = new NewERDFileTemeplate
		template.getContents(fileName)		
	}
}