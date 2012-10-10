package net.jeeeyul.erd.wizard

import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard
import org.eclipse.ui.ide.IDE
import org.eclipse.ui.PartInitException

class NewERDDiagramWizard extends BasicNewFileResourceWizard {
	private NewERDDiagramWizardPage mainPage
	
	override addPages() {
		mainPage = new NewERDDiagramWizardPage("New ERD", selection)
		addPage(mainPage)
	}
	
	override performFinish() {
		var file = mainPage.createNewFile();
        if (file == null) {
			return false;
		}

        selectAndReveal(file);

        // Open editor on new file.
        var dw = getWorkbench().getActiveWorkbenchWindow();
        try {
            if (dw != null) {
                var page = dw.getActivePage();
                if (page != null) {
                    IDE::openEditor(page, file, true);
                    return true;
                }
            }
        } catch (PartInitException e) {
           	e.printStackTrace;
           	return false;
        }
        
        return false
	}
	
}