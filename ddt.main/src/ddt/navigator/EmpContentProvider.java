package ddt.navigator;

import org.eclipse.core.internal.runtime.Log;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.equinox.log.Logger;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import javax.inject.Inject;

import ddt.model.IModelElement;
import ddt.model.Root;

public class EmpContentProvider implements ITreeContentProvider {
	
	@Inject Logger logger;

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
		logger.log(IStatus.ERROR,"Çàø¸ë â getElements()");
		System.out.println("Çàø¸ë â getElements()");
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		System.out.println("Çàø¸ë â getChildren()");
		if(parentElement instanceof Root){
			((Root) parentElement).getChildren();
		}else if(parentElement instanceof IModelElement){
			return ((IModelElement)parentElement).getChildren();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		System.out.println("Çàø¸ë â getParent()");
		if(element instanceof IModelElement){
			return ((IModelElement)element).getParent();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		System.out.println("Çàø¸ë â hasChildren()");
		if(element instanceof Root){
			return true;
		}else if(element instanceof IModelElement){
			return ((IModelElement)element).getChildren().length > 0;
		}
		return false;
	}

}
