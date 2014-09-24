package org.udiga.ddt.view;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public static String PERSPECTIVE_ID = "ddt.views.perspective";
	public void createInitialLayout(IPageLayout layout) {

		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);

		IFolderLayout naviFolder = layout.createFolder("navigator",
				IPageLayout.LEFT, 0.30f, editorArea);

		naviFolder.addView(NavigatorView.VIEW_ID);

	}
}
