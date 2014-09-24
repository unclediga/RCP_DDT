package ddt.model;

import java.util.ArrayList;
import java.util.List;

public class Dept implements IModelElement {
	
	private IModelElement parent;
	private String name;

	@Override
	public IModelElement getParent() {
		return parent;
	}

	private List<IModelElement> content = new ArrayList<>(10);

	public void addElement(IModelElement element) {
		content.add(element);
	}

	public void addElements(IModelElement[] elements) {
		
		for (IModelElement e : elements) {
			content.add(e);
		}
	}

	
	public IModelElement[] getChildren() {
		return (IModelElement[])content.toArray();
	}

	public Dept(IModelElement[] content) {
		
		for(IModelElement e: content){
			this.content.add(e);
		}
	}

	public Dept(String string) {
		this.content = new ArrayList<IModelElement>();
	}

	public String getName() {
		return name;
	}

	@Override
	public String getLabel() {
		return getName();
	}

}
