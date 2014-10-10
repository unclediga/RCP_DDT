package org.udiga.ddt.navigator;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import org.udiga.ddt.app.Activator;
import org.udiga.ddt.model.INavigatorElement;
import org.udiga.ddt.model.Person;

public class PersonLabelProvider extends LabelProvider {

	Image imgPerson = null;

	private void log(String message) {
		System.out.println(this.getClass().getSimpleName() + "."+message);
	}
	
	@Override
	public String getText(Object element) {
		log("getText() <- "+element);
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
	public void dispose() {
		imgPerson.dispose();
		super.dispose();
	}

	@Override
	public Image getImage(Object element) {

		log("getImage() <- "+element);

		if (element instanceof Person) {
			return imgPerson;
		}
		String imageKey = ISharedImages.IMG_OBJS_WARN_TSK;
		return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);

	}

	public PersonLabelProvider() {
		super();
		imgPerson = createImage("man216.png");
	}

	
	
}
