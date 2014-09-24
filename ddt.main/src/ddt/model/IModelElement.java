package ddt.model;

public interface IModelElement {
	
	public IModelElement getParent();

	public IModelElement[] getChildren();

	public String getLabel();

}
