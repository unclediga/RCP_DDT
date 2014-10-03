package org.udiga.ddt.navigator;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.IDescriptionProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import org.udiga.ddt.app.Activator;
import org.udiga.ddt.model.Dept;
import org.udiga.ddt.model.Emp;
import org.udiga.ddt.model.INavigatorElement;
import org.udiga.ddt.model.Person;

public class EmpLabelProvider extends LabelProvider implements IDescriptionProvider {
	
	Image imgEmp = null;
	Image imgDept = null;
	Image imgDDT = null;

	@Override
	public String getText(Object element) {
		// System.out.println("EmpLabelProv.getText():"+element);
		if (element instanceof INavigatorElement) {
			return ((INavigatorElement) element).getLabel();
		}

		return super.getText(element);
	}

	@Override
	public void dispose() {
		
		imgDDT.dispose();
		imgEmp.dispose();
		imgDept.dispose();

		super.dispose();
	}

	private Image createImage(String fileName) {

		ImageDescriptor descriptor = AbstractUIPlugin
				.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/"
						+ fileName);
		return descriptor.createImage();

	}

	@Override
	public Image getImage(Object element) {

		if (element instanceof Dept) {
			if (((Dept) element).getParent() == null)
				return imgDDT;
			else
				return imgDept;
		} else if (element instanceof Emp) {
			return imgEmp;
		}
		String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
		// imageKey = ISharedImages.IMG_OBJ_FOLDER;
		return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);

	}

	@Override
	public String getDescription(Object element) {
	
		return ((INavigatorElement)element).getLabel();
		
	}

	public EmpLabelProvider() {
		super();
		imgEmp = createImage("woman16.png");
		imgDDT = createImage("home16.png");
		imgDept = createImage("Binary-tree16.png");
	}

}
