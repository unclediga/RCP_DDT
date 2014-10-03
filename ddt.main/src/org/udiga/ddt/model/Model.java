package org.udiga.ddt.model;

public class Model {

	private static INavigatorElement[] rootContent = null;
	
	public static Dept getDeptTree() {
		
		//System.out.println("Generate Model...");
		Dept d = new Dept("���");
		
		Dept d1 = new Dept("������ �1");
		Dept d2 = new Dept("������ �2");
		Dept d3 = new Dept("������ �3");
		
		d.addElements(new INavigatorElement[]{d1,d2,d3});
		
		Person p1 = new Person("����", "��������","������");
		Person p2 = new Person("����", "��������","������");
		Person p3 = new Person("�����", "���������","�������");

		Emp e1 = new Emp(p1,"�������");
		Emp e2 = new Emp(p2,"��������");
		Emp e3 = new Emp(p3,"���������");
		
		d1.addElements(new INavigatorElement[]{e1,e2,e3});
		
		p1 = new Person("����", "��������","������2");
		p2 = new Person("����", "��������","������2");
		p3 = new Person("�����", "���������","�������2");
		e1 = new Emp(p1,"�������");
		e2 = new Emp(p2,"��������");
		e3 = new Emp(p3,"���������");

		
		d2.addElements(new INavigatorElement[]{e1,e2,e3});

		p1 = new Person("����", "��������","������3");
		p2 = new Person("����", "��������","������3");
		p3 = new Person("�����", "���������","�������3");
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
