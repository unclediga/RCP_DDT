package ddt.model;

public class Model {

	public static Dept getDeptTree() {
		
		Dept d = new Dept("���");
		
		Dept d1 = new Dept("������ �1");
		Dept d2 = new Dept("������ �2");
		Dept d3 = new Dept("������ �3");
		
		d.addElements(new IModelElement[]{d1,d2,d3});
		
		Person p1 = new Person("����", "��������","������");
		Person p2 = new Person("����", "��������","������");
		Person p3 = new Person("�����", "���������","�������");

		Emp e1 = new Emp(p1,"�������");
		Emp e2 = new Emp(p2,"��������");
		Emp e3 = new Emp(p3,"���������");
		
		d1.addElements(new IModelElement[]{e1,e2,e3});
		
		p1 = new Person("����", "��������","������2");
		p2 = new Person("����", "��������","������2");
		p3 = new Person("�����", "���������","�������2");
		e1 = new Emp(p1,"�������");
		e2 = new Emp(p2,"��������");
		e3 = new Emp(p3,"���������");

		
		d2.addElements(new IModelElement[]{e1,e2,e3});

		p1 = new Person("����", "��������","������3");
		p2 = new Person("����", "��������","������3");
		p3 = new Person("�����", "���������","�������3");
		e1 = new Emp(p1,"�������");
		e2 = new Emp(p2,"��������");
		e3 = new Emp(p3,"���������");
		
		d3.addElements(new IModelElement[]{e1,e2,e3});
		
		return d;
	}

	
	
	
}