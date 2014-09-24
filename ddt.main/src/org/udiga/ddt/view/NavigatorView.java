package org.udiga.ddt.view;

import org.eclipse.ui.navigator.CommonNavigator;

import ddt.model.Root;

public class NavigatorView extends CommonNavigator {

	public static String VIEW_ID = "ddt.views.navigator";

	@Override
	protected Object getInitialInput() {
		return new Root();
	}

}
