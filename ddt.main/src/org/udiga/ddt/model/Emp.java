package org.udiga.ddt.model;

public class Emp implements INavigatorElement {

	private Person person;
	private String appoint;

	private INavigatorElement parent;

	public Emp(Person person, String appoint) {
		this.person = person;
		this.appoint = appoint;
	}

	public Person getPerson() {
		return person;
	}

	@Override
	public INavigatorElement getParent() {
		return parent;
	}

	@Override
	public void setParent(INavigatorElement parent) {
		this.parent = parent;
	}

	@Override
	public INavigatorElement[] getChildren() {
		return new INavigatorElement[] { person };
	}

	@Override
	public boolean hasChildren() {
		return person != null;
	}

	@Override
	public String getLabel() {
		return person.getFullName() + ":(" + appoint + ")";
	}

	@Override
	public String toString() {
		return "EMP:" + appoint + ":" + person.getFullName();
	}

}
