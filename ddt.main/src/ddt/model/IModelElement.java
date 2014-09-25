package ddt.model;

public interface IModelElement {
	
	public IModelElement getParent();

	public void setParent(IModelElement parent);
	
	public IModelElement[] getChildren();
	
	public boolean hasChildren(); 

	public String getLabel();


}
