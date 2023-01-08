package methodRefrences.cons;

public class COnstrucMain {
	public static void main(String[] args) {
		System.out.println("Constructor refrence learning");
	// normal process as we are doing using lambda
		StudInter stu = ()->{
			return new Student();
		};
		Student student = stu.getStudent();
		student.display();
		
		// we want constructor reference
		//COnstructor reference using ClassName :: new keyword thats it.
		StudInter stu2 = Student::new;
		Student student2 = stu2.getStudent();
		student2.display();
		
		
		
	
	
	}
}
