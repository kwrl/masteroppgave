package com.kaurel.klang.project;


import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class SimpleKlangProject extends Wizard {
	private WizardNewProjectCreationPage _page;

	@Override
	public void addPages() {

	}

	@Override
	public boolean performFinish() {
		return false;
	}

	class SimpleKlangProjectCreationPage extends WizardPage {
		private Composite container;
		private Text text1;
		@Override
		public void createControl(Composite parent) {
			container = new Composite(parent, SWT.NONE);
			GridLayout layout = new GridLayout();
			container.setLayout(layout);
			layout.numColumns = 2;
			Label label1 = new Label(container, SWT.NONE);
			label1.setText("Project name");

			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			text1.setLayoutData(gd);
			setControl(container);
			setPageComplete(false);
		}

	}
}
