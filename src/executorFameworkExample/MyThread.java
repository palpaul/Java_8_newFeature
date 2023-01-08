package executorFameworkExample;

public class MyThread implements Runnable{

	@Override
	public void run() {
		SingletonExp singleton = SingletonExp.getInstance();
		System.out.println(Thread.currentThread().getName()+" "+singleton.hashCode());
		
	}

}
