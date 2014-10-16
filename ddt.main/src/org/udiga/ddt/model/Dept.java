package org.udiga.ddt.model;

import java.util.ArrayList;
import java.util.List;

public class Dept implements INavigatorElement {

	private INavigatorElement parent;
	private Integer id;
	private String name;
	private List<INavigatorElement> content;

	@Override
	public INavigatorElement getParent() {
		return parent;
	}

	@Override
	public void setParent(INavigatorElement parent) {
		this.parent = parent;
	}

	public void addElement(INavigatorElement element) {
		content.add(element);
	}

	public void addElements(INavigatorElement[] elements) {

		for (INavigatorElement e : elements) {
			content.add(e);
			e.setParent(this);
		}
	}

	public INavigatorElement[] getChildren() {
		/*
		 * Нельзя просто return (IModelElement[])content.toArray(); Получишь
		 * ClassCastExeption, потому что реально создаётся новый массив Object[]
		 * вместо IModelElement[] см. JavaDoc
		 */
		INavigatorElement[] array = new INavigatorElement[content.size()];
		return content.toArray(array);
	}

	@Override
	public boolean hasChildren() {
		return content.size() > 0;
	}

	public Dept(INavigatorElement[] content) {

		for (INavigatorElement e : content) {
			this.content.add(e);
		}
	}

	public Dept(Integer id, String name) {
		this.id = id;
		this.name = name;
		this.content = new ArrayList<INavigatorElement>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return "DEPT:" + id + ":" + name;
	}

}
