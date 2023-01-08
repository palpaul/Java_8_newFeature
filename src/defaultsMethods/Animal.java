package defaultsMethods;

public interface Animal {
	public default void leg() {
		System.out.println("I'm default method");
	}

}
