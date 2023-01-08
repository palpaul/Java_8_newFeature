package competative;

public class Arithmet {

	void check()throws ArithmeticException{
		throw new ArithmeticException("________An arithmetic exception is thrown...______");
	}
	public static void main(String[] args)throws ArithmeticException {
	Arithmet obj = new Arithmet();
	obj.check();
	System.out.println("Program executed Successfully");
	
}
}
