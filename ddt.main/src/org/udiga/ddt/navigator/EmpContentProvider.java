package org.udiga.ddt.navigator;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import org.udiga.ddt.model.Dept;
import org.udiga.ddt.model.Emp;
import org.udiga.ddt.model.INavigatorElement;
import org.udiga.ddt.model.Model;
import org.udiga.ddt.model.Root;

public class EmpContentProvider implements ITreeContentProvider {

	private void log(String message) {
		System.out.println(this.getClass().getSimpleName() + "."+message);
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
		log("getElements() <- "+inputElement);
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		log("getChildren() <- "+parentElement);
		if(parentElement instanceof Root){
			return Model.getRootContent();
		}else if(parentElement instanceof Dept){
			return ((INavigatorElement)parentElement).getChildren();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		log("getParent() <- "+element);
		if(element instanceof INavigatorElement){
			return ((INavigatorElement)element).getParent();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		log("hasChildren() <- "+element);
		boolean res = false;
		if(element instanceof Root){
			res = true;
		}else if(element instanceof Emp){
			res = false;
		}else if(element instanceof INavigatorElement) {
			res = ((INavigatorElement)element).hasChildren();
		}
		log("res ->" + res);
		return res;
	}

}
