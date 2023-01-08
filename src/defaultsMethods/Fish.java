package defaultsMethods;

public class Fish implements Animal{

	@Override
	public void leg() {
		System.out.println("Fish has no legs");
		Animal.super.leg();
	}
}
