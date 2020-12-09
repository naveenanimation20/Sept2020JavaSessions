package OOP_Encapsulation;

public class Employee {
	// data members: (non static) class vars + class methods
	//data hiding -- Encapsulation
	//hiding the private data members of class and give the access via public getter/setters methods
	private String name;
	private int id;
	private int age;
	private double salary;

	// getter and setter methods: (public methods)
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String a[]) {
		Employee e1 = new Employee();
		e1.name = "Tom";
		System.out.println(e1.name);
	}

}
