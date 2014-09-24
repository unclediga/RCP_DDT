package ddt.navigator;

import org.eclipse.jface.viewers.LabelProvider;

import ddt.model.IModelElement;

public class EmpLabelProvider extends LabelProvider {

	@Override
	public String getText(Object element) {
		if(element instanceof IModelElement){
			((IModelElement) element).getLabel();
		}
		return super.getText(element);
	}
	
	

}
