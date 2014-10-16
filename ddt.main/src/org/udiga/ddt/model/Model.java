package org.udiga.ddt.model;

public class Model {

	private static INavigatorElement[] rootContent = null;
	
	public static Dept getDeptTree() {
		
		//System.out.println("Generate Model...");
		Dept d = new Dept(1, "���");
		
		Dept d1 = new Dept(2, "������ �1");
		Dept d2 = new Dept(3, "������ �2");
		Dept d3 = new Dept(4, "������ �3");
		
		d.addElements(new INavigatorElement[]{d1,d2,d3});
		
		Person p1 = new Person(1,"����", "��������","������");
		Person p2 = new Person(2,"����", "��������","������");
		Person p3 = new Person(3,"�����", "���������","�������");

		Emp e1 = new Emp(p1,"�������");
		Emp e2 = new Emp(p2,"��������");
		Emp e3 = new Emp(p3,"���������");
		
		d1.addElements(new INavigatorElement[]{e1,e2,e3});
		
		p1 = new Person(11, "����", "��������","������2");
		p2 = new Person(12, "����", "��������","������2");
		p3 = new Person(13, "�����", "���������","�������2");
		e1 = new Emp(p1,"�������");
		e2 = new Emp(p2,"��������");
		e3 = new Emp(p3,"���������");

		
		d2.addElements(new INavigatorElement[]{e1,e2,e3});

		p1 = new Person(13, "����", "��������","������3");
		p2 = new Person(23, "����", "��������","������3");
		p3 = new Person(33, "�����", "���������","�������3");
		e1 = new Emp(p1,"�������");
		e2 = new Emp(p2,"��������");
		e3 = new Emp(p3,"���������");
		
		d3.addElements(new INavigatorElement[]{e1,e2,e3});
		
		return d;
	}

	public static INavigatorElement[] getRootContent() {
		Dept rootDept =  getDeptTree();
		if(rootContent == null){
			rootContent = new INavigatorElement[] {rootDept};
		}
		return rootContent;
	}
}
