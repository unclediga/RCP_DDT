package org.udiga.ddt.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

public class TestView1 extends ViewPart {

	public static final String ID = "ddt.views.test1";
	
	public TestView1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		Label l1 = new Label(parent, SWT.NONE);
		l1.setText("Label 1");
		Label l2 = new Label(parent, SWT.NONE);
		l2.setText("Label 2");
		
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}


}
