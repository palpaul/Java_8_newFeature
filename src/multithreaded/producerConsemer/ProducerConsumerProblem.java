package multithreaded.producerConsemer;

public class ProducerConsumerProblem {
Thread i;
boolean produced= false;
static Thread t1;
static Thread t2;
public void Produce(Thread t1) {
	if(produced) {
		try {
			wait();
		} catch (Exception e) {
			
		}
	}
	i=t1;
	produced = true;
	notify();
}

public void Consume(Thread t2) {
	if(!produced) {
		try {
			wait();
		} catch (Exception e) {
		}
	}
	produced= false;
	notify();
}

public static void main(String[] args) {
	ProducerConsumerProblem obj = new ProducerConsumerProblem();
	obj.Produce(t1);
	System.out.println("producing items" +t1);
	obj.Consume(t2);
	System.out.println("consuming items" +t2);		

}
}