package ddt.model;

public class Model {

	private static IModelElement[] rootContent = null;
	
	public static Dept getDeptTree() {
		
		System.out.println("Generate Model...");
		Dept d = new Dept("ДДТ");
		
		Dept d1 = new Dept("Департ №1");
		Dept d2 = new Dept("Департ №2");
		Dept d3 = new Dept("Департ №3");
		
		d.addElements(new IModelElement[]{d1,d2,d3});
		
		Person p1 = new Person("Иван", "Иванович","Иванов");
		Person p2 = new Person("Петр", "Петрович","Петров");
		Person p3 = new Person("Сидор", "Сидорович","Сидоров");

		Emp e1 = new Emp(p1,"Слесарь");
		Emp e2 = new Emp(p2,"Электрик");
		Emp e3 = new Emp(p3,"Сантехник");
		
		d1.addElements(new IModelElement[]{e1,e2,e3});
		
		p1 = new Person("Иван", "Иванович","Иванов2");
		p2 = new Person("Петр", "Петрович","Петров2");
		p3 = new Person("Сидор", "Сидорович","Сидоров2");
		e1 = new Emp(p1,"Слесарь");
		e2 = new Emp(p2,"Электрик");
		e3 = new Emp(p3,"Сантехник");

		
		d2.addElements(new IModelElement[]{e1,e2,e3});

		p1 = new Person("Иван", "Иванович","Иванов3");
		p2 = new Person("Петр", "Петрович","Петров3");
		p3 = new Person("Сидор", "Сидорович","Сидоров3");
		e1 = new Emp(p1,"Слесарь");
		e2 = new Emp(p2,"Электрик");
		e3 = new Emp(p3,"Сантехник");
		
		d3.addElements(new IModelElement[]{e1,e2,e3});
		
		return d;
	}

	public static IModelElement[] getRootContent() {
		Dept rootDept =  getDeptTree();
		if(rootContent == null){
			rootContent = new IModelElement[] {rootDept};
		}
		return rootContent;
	}
}
