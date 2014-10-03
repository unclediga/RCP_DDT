package org.udiga.ddt.view;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;

import ddt.model.Root;

public class NavigatorView extends CommonNavigator {

	public static String VIEW_ID = "ddt.views.navigator";

	@Override
	protected Object getInitialInput() {
		return new Root();
	}

	@Override
	public void createPartControl(Composite aParent) {

		super.createPartControl(aParent);
		
		final CommonViewer viewer = super.getCommonViewer();
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				MessageDialog.openInformation(viewer.getControl().getShell(), 
						"Двойной клик", "Hello message!");
				
			}
		});
	}
	
	
	
}
