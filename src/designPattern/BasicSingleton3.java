package designPattern;

public class BasicSingleton3 {
	// thread safe multi thread environment
	private static BasicSingleton3 instance;

	private BasicSingleton3() {
		if (instance != null) {
			throw new RuntimeException("get you obj by getInstance() method");
		}
	}

	public static BasicSingleton3 getInstance() {
		if (instance == null) {
			synchronized (BasicSingleton3.class) {
				if (instance == null) {
					instance = new BasicSingleton3();
				}
			}

		}
		return instance;
	}

}
