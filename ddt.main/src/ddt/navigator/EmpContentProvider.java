package ddt.navigator;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import ddt.model.IModelElement;
import ddt.model.Model;
import ddt.model.Root;

public class EmpContentProvider implements ITreeContentProvider {
	
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
		//System.out.println("EmpContentProvider.getElements():"+inputElement);
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		//System.out.println("EmpContentProvider.getChildren():"+parentElement);
		if(parentElement instanceof Root){
			return Model.getRootContent();
		}else if(parentElement instanceof IModelElement){
			return ((IModelElement)parentElement).getChildren();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		////System.out.println("EmpContentProvider.getParent():"+element);
		if(element instanceof IModelElement){
			return ((IModelElement)element).getParent();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		//System.out.println("EmpContentProvider.hasChildren():"+element);
		if(element instanceof Root){
			return true;
		}else if(element instanceof IModelElement){
			return ((IModelElement)element).hasChildren();
		}
		return false;
	}

}
