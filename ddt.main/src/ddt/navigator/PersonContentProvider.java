package ddt.navigator;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import ddt.model.Emp;
import ddt.model.INavigatorElement;

public class PersonContentProvider implements ITreeContentProvider {

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
		log("PersonContentProvider.getElements():"+inputElement);
		if(inputElement instanceof Emp){
			return getChildren(inputElement);
		}
		return null;
		
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		log("PersonContentProvider.getChildren():"+parentElement);
		if(parentElement instanceof Emp){
			return new Object[]{((Emp) parentElement).getPerson()};
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		log("PersonContentProvider.getParent():"+element);
		if(element instanceof INavigatorElement){
			return ((INavigatorElement)element).getParent();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		log("PersonContentProvider.hasChildren():"+element);
		if(element instanceof Emp){
			return ((Emp) element).getPerson() != null;
		}
		return false;
	}

}
