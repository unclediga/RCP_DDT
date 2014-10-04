package org.udiga.ddt.model;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

public class Emp implements INavigatorElement, IPropertySource {

	private Person person;
	private String appoint;

	private static final String EMP_NAME = "emp.name";
	private static final String EMP_PARENT = "emp.parent";
	private IPropertyDescriptor[] propertyDescriptors = null;
	
	class EmpPD extends PropertyDescriptor{
		public EmpPD(Object id, String displayName) {
			super(id, displayName);
		}
		
		
	}
	
	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		if(propertyDescriptors == null){
			propertyDescriptors = new IPropertyDescriptor[]{
					new PropertyDescriptor(EMP_NAME, "Emp name"),					
					new TextPropertyDescriptor(EMP_PARENT, "Emp parent")					
			};
		}
		return propertyDescriptors;
	}

	@Override
	public Object getPropertyValue(Object id) {
		if(id.equals(EMP_NAME)){
			return person.getFullName();
		}else if (id.equals(EMP_PARENT)) {
			return parent.getLabel();
		}
		return null;
	}

	@Override
	public Object getEditableValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPropertySet(Object id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void resetPropertyValue(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		// TODO Auto-generated method stub
		
	}

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
