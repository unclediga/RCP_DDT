package org.udiga.ddt.model;

public class Model {

	private static INavigatorElement[] rootContent = null;
	
	public static Dept getDeptTree() {
		
		//System.out.println("Generate Model...");
		Dept d = new Dept(1, "ДДТ");
		
		Dept d1 = new Dept(2, "Департ №1");
		Dept d2 = new Dept(3, "Департ №2");
		Dept d3 = new Dept(4, "Департ №3");
		
		d.addElements(new INavigatorElement[]{d1,d2,d3});
		
		Person p1 = new Person(1,"Иван", "Иванович","Иванов");
		Person p2 = new Person(2,"Петр", "Петрович","Петров");
		Person p3 = new Person(3,"Сидор", "Сидорович","Сидоров");

		Emp e1 = new Emp(p1,"Слесарь");
		Emp e2 = new Emp(p2,"Электрик");
		Emp e3 = new Emp(p3,"Сантехник");
		
		d1.addElements(new INavigatorElement[]{e1,e2,e3});
		
		p1 = new Person(11, "Иван", "Иванович","Иванов2");
		p2 = new Person(12, "Петр", "Петрович","Петров2");
		p3 = new Person(13, "Сидор", "Сидорович","Сидоров2");
		e1 = new Emp(p1,"Слесарь");
		e2 = new Emp(p2,"Электрик");
		e3 = new Emp(p3,"Сантехник");

		
		d2.addElements(new INavigatorElement[]{e1,e2,e3});

		p1 = new Person(13, "Иван", "Иванович","Иванов3");
		p2 = new Person(23, "Петр", "Петрович","Петров3");
		p3 = new Person(33, "Сидор", "Сидорович","Сидоров3");
		e1 = new Emp(p1,"Слесарь");
		e2 = new Emp(p2,"Электрик");
		e3 = new Emp(p3,"Сантехник");
		
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
