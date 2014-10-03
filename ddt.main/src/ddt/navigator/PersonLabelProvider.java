package ddt.navigator;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import org.udiga.ddt.app.Activator;

import ddt.model.INavigatorElement;
import ddt.model.Person;

public class PersonLabelProvider extends LabelProvider {

	@Override
	public String getText(Object element) {
		// System.out.println("EmpLabelProv.getText():"+element);
		if (element instanceof INavigatorElement) {
			return ((INavigatorElement) element).getLabel();
		}

		return super.getText(element);
	}

	private Image createImage(String fileName) {

		ImageDescriptor descriptor = AbstractUIPlugin
				.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/"
						+ fileName);
		return descriptor.createImage();

	}

	@Override
	public Image getImage(Object element) {

		if (element instanceof Person) {
			return createImage("man216.png");
		}
		String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
		// imageKey = ISharedImages.IMG_OBJ_FOLDER;
		return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);

	}

}