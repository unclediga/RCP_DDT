package ddt.model;

public class Person implements IModelElement {
	private String fname;
	private String mname;
	private String lname;
	@Override
	public IModelElement getParent() {
		return null;
	}
	@Override
	public IModelElement[] getChildren() {
		return null;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFullName() {
		return ""+getLname()+" "+getFname()+" "+getMname();
	}
	public Person(String fname, String mname, String lname) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
	}
	@Override
	public String getLabel() {
		return getFullName();
	}
	
	
}
