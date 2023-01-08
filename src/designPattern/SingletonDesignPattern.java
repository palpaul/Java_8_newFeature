package designPattern;

public class SingletonDesignPattern {
	
	// private instance, so that it can be
	  // accessed by only by getInstance() method
	
	private static SingletonDesignPattern instance;
	
	private SingletonDesignPattern() {
		//private constructor  outside of the class obj cant be created. 
		//use only single obj throught the application
	}
	
	public static SingletonDesignPattern getInstance() {
			if(instance==null) {
				//synchronized block to remove overhead
				synchronized(SingletonDesignPattern.class) {
					if(instance == null) {
						//if instance is null, initialize
						instance = new  SingletonDesignPattern();
						
					}
				}
			}
		
		return instance;
	}
	
	public static void main(String[] args) {
		System.out.println("We will get single and sunchronized object of the class---> " +instance.getInstance());
		
	}

}
