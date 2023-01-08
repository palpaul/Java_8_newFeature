package scenariobaseQue;

public class Scenario1 {
	
	public static void main(String[] args) {
		Child obj1 = new Child();
		Parent obj2 = new Parent();
		//scenario2 we dont need to make an object of static method 
		// we can call it directly by using the class name although it will not thorugh the any complie time error
		// jvn internally remove htis obj and assign the call name instead of obj
		Child.Text();
		Parent.Text();
		obj1.Text();
		obj2.Text();
	}

}
