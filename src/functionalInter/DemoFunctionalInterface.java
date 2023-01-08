package functionalInter;

public class DemoFunctionalInterface implements FunclInterface{
	public static void main(String[] args) {
		FunclInterface fintr= new DemoFunctionalInterface();
		fintr.sumNum(6, 4);
		fintr.show();
		FunclInterface.helloStatic();
		//by making a annoumus class calling myinterface methods
		FunclInterface fint = new FunclInterface() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("show method using anonmous class proving another imp for abstract method ok");
			}
		};fint.show();
		fint.sumNum(11, 12);
		// buy using lambda expression
		FunclInterface lembda=()->{
			System.out.println("show method this is using lambda expression ");
		};lembda.show();
		lembda.sumNum(1, 2);
		
		
	} // main closed

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("I was abstract method here my imp is provided by another class ok");
		
	}

}
