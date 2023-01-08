package designPattern;

class SIngletonn {
private static SIngletonn instance;

public static SIngletonn getInstance(){
if(instance == null){
	//we can not use this in static context. ok so here we cant  use this ok 

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
instance = new SIngletonn();
			
		
	}
		return instance;

	}
public static void main(String[] args) {
	SIngletonn obj1 = SIngletonn.getInstance();
	SIngletonn obj2 = SIngletonn.getInstance();
	SIngletonn obj3 = SIngletonn.getInstance();
	System.out.println(instance.getInstance().hashCode());
	System.out.println(instance.getInstance().hashCode());
	System.out.println(obj1.hashCode());
	System.out.println(obj2.hashCode());
	System.out.println(obj3.hashCode());
}
}

