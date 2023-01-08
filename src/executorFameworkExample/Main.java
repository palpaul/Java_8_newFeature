package executorFameworkExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	
	public static void main(String[] args) throws Exception {
		//without executor serivce 
//		SingletonExp obj=SingletonExp.getInstance();
//		SingletonExp obj1=SingletonExp.getInstance();
//		System.out.println(obj.hashCode());
//		System.out.println(obj1.hashCode());
		
		ExecutorService  executorService = null;
		try {
			//as of now we are defining only 3 thread pool (using finxed size ok)
			executorService = Executors.newFixedThreadPool(4);//total  max 4 thread are running
			//here we need runnalbe obj
			MyThread myThread = new MyThread();
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}//when we executing executor then always requred shutdown so we require a finally bolck also
		finally {
			if(executorService !=null) {
				executorService.shutdown();
			}else throw new Exception("null pointer exception...!!!");
		}
	}

}
