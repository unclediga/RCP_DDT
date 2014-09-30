package ddt.model;

public interface INavigatorElement {
	
	public INavigatorElement getParent();

	public void setParent(INavigatorElement parent);
	
	public INavigatorElement[] getChildren();
	
	public boolean hasChildren(); 

	public String getLabel();


}
