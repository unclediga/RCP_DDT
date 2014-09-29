package ddt.model;

public class Emp implements IModelElement {

	private Person person;
	private String appoint;

	private IModelElement parent;

	public Emp(Person person, String appoint) {
		this.person = person;
		this.appoint = appoint;
	}

	public Person getPerson() {
		return person;
	}

	@Override
	public IModelElement getParent() {
		return parent;
	}

	@Override
	public void setParent(IModelElement parent) {
		this.parent = parent;
	}

	@Override
	public IModelElement[] getChildren() {
		return new IModelElement[] { person };
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
