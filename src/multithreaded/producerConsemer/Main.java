package multithreaded.producerConsemer;

public class Main implements Runnable {
	public static void main(String[] args) {
		ProducerConsumerProblem obj = new ProducerConsumerProblem();
		obj.Produce(t1);
		System.out.println("producing items" +t1);
		obj.Consume(t2);
		System.out.println("consuming items" +t2);		
	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		

	}

}
