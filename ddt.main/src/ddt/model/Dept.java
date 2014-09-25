package ddt.model;

import java.util.ArrayList;
import java.util.List;

public class Dept implements IModelElement {

	private IModelElement parent;
	private String name;
	private List<IModelElement> content;

	@Override
	public IModelElement getParent() {
		return parent;
	}

	@Override
	public void setParent(IModelElement parent) {
		this.parent = parent;
	}

	public void addElement(IModelElement element) {
		content.add(element);
	}

	public void addElements(IModelElement[] elements) {

		for (IModelElement e : elements) {
			content.add(e);
			e.setParent(this);
		}
	}

	public IModelElement[] getChildren() {
		/* Нельзя просто
		 * return (IModelElement[])content.toArray();
		 * Получишь ClassCastExeption, потому что реально 
		 * создаётся новый массив Object[] вместо IModelElement[]
		 * см. JavaDoc 
		 * */
		IModelElement[] array = new IModelElement[content.size()];
		return content.toArray(array);
	}

	@Override
	public boolean hasChildren() {
		return content.size() > 0;
	}

	public Dept(IModelElement[] content) {

		for (IModelElement e : content) {
			this.content.add(e);
		}
	}

	public Dept(String name) {
		this.name = name;
		this.content = new ArrayList<IModelElement>();
	}

	public String getName() {
		return name;
	}

	@Override
	public String getLabel() {
		return getName();
	}

	@Override
	public String toString() {
		return "DEPT:" + name;
	}

}
