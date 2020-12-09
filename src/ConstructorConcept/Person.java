package ConstructorConcept;

public class Person {
	
	//class vars
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	public Person(){
		System.out.println("Hello Person");
	}
	
	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public Person(String name, int age, double salary, boolean isPermanent, char gender) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isPermanent = isPermanent;
		this.gender = gender;
	}

	public static void main(String[] args) {
		
		Person p1 = new Person("Nikita", 25);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		Person p2 = new Person("Supriya", 26, 45.55);
		System.out.println(p2.name + " " + p2.age + " " + p2.salary);
		
		Person p3 = new Person("Anu", 24, 23.44, false, 'F');
		System.out.println(p3.name + " " + p3.isPermanent);
		System.out.println(p3.salary);

	}

}
