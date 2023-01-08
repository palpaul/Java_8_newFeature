package executorFameworkExample;

public class SingletonExp {

	private static SingletonExp instance;
	//private constructor
	private SingletonExp() {
		
	}
	//create a public method
	public static SingletonExp getInstance() {
		if(instance==null) {
			//synchronized block
			synchronized(SingletonExp.class) {
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(instance==null) {
					instance = new SingletonExp();
				}
			}
		}
		return instance;
	}
	
}
