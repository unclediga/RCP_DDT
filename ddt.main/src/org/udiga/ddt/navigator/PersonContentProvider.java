package org.udiga.ddt.navigator;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import org.udiga.ddt.model.Emp;
import org.udiga.ddt.model.INavigatorElement;

public class PersonContentProvider implements ITreeContentProvider {

	private void log(String message) {
		System.out.println(this.getClass().getSimpleName() + "." + message);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		log("inputChanged()");
	}

	@Override
	public Object[] getElements(Object inputElement) {
		log("getElements() <- " + inputElement);
		if (inputElement instanceof Emp) {
			return getChildren(inputElement);
		}
		return null;

	}

	@Override
	public Object[] getChildren(Object parentElement) {
		log("getChildren() <- " + parentElement);
		if (parentElement instanceof Emp) {
			return new Object[] { ((Emp) parentElement).getPerson() };
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		log("getParent() <- " + element);
		if (element instanceof INavigatorElement) {
			return ((INavigatorElement) element).getParent();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		log("hasChildren() <- " + element);
		boolean res = false;
		if (element instanceof Emp) {
			res = ((Emp) element).getPerson() != null;
		}
		log("res -> " + res);
		return res;
	}

}
