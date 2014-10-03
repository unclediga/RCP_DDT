package org.udiga.ddt.navigator;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import org.udiga.ddt.model.Dept;
import org.udiga.ddt.model.INavigatorElement;
import org.udiga.ddt.model.Model;
import org.udiga.ddt.model.Root;

public class EmpContentProvider implements ITreeContentProvider {

	private void log(String message) {
		//System.out.println(message);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] getElements(Object inputElement) {
		log("EmpContentProvider.getElements():"+inputElement);
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		log("EmpContentProvider.getChildren():"+parentElement);
		if(parentElement instanceof Root){
			return Model.getRootContent();
		}else if(parentElement instanceof INavigatorElement){
			return ((INavigatorElement)parentElement).getChildren();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		log("EmpContentProvider.getParent():"+element);
		if(element instanceof INavigatorElement){
			return ((INavigatorElement)element).getParent();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		log("EmpContentProvider.hasChildren():"+element);
		if(element instanceof Root){
			return true;
		}else if(element instanceof Dept) {
			return ((INavigatorElement)element).hasChildren();
		}
		return false;
	}

}
