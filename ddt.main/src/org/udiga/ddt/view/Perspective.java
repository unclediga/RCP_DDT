package org.udiga.ddt.view;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import org.omg.CORBA.NVList;

public class Perspective implements IPerspectiveFactory {

	public static final String PERSPECTIVE_ID = "ddt.views.perspective";
	
	public void createInitialLayout(IPageLayout layout) {

		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);

		IFolderLayout naviFolder = layout.createFolder("navigator",
				IPageLayout.LEFT, 0.30f, editorArea);

		naviFolder.addView(NavigatorView.VIEW_ID);

		IFolderLayout bottomFolder = layout.createFolder("properties",
				IPageLayout.BOTTOM, 0.50f, editorArea);

		bottomFolder.addView(layout.ID_PROP_SHEET);
		bottomFolder.addView(layout.ID_PROBLEM_VIEW);
		bottomFolder.addView(layout.ID_TASK_LIST);

		
		IFolderLayout bottomLeft = layout.createFolder("bottomLeft",
				IPageLayout.BOTTOM, 0.50f, "navigator");

		bottomLeft.addView(layout.ID_OUTLINE);
		
		layout.setFixed(true);

// см. плагин ddt.examples		
//		IFolderLayout rightFolder = layout.createFolder("rF", IPageLayout.RIGHT, 0.3f, editorArea);
//		rightFolder.addView(ddt.views.TestView1.ID);
	}
}
