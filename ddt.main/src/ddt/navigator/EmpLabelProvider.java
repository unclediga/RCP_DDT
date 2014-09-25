package ddt.navigator;

import org.eclipse.jface.viewers.LabelProvider;

import ddt.model.IModelElement;
import ddt.model.Root;

public class EmpLabelProvider extends LabelProvider {

	@Override
	public String getText(Object element) {
		System.out.println("EmpLabelProv.getText():"+element);
		if(element instanceof IModelElement){
			return ((IModelElement) element).getLabel();
		}else if (element instanceof Root) {
			return "Root Label";
		}
		return super.getText(element);
	}
	
	

}
