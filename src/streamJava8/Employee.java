package streamJava8;

public class Employee{


	private String name;
	private int age;
	private int sal;
	//Getters & Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Employee(String name, int age, int sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
}