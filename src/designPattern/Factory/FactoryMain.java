package designPattern.Factory;

public class FactoryMain {
	public static void main(String[] args){
		/*
		
		 this is the normal flow if have to use all the implementation classes for our interface 
		 we have to create all the obj and we are showing all the logic to the client ok
		OS os = new Android();
		OS os1 = new IOS();
		OS os2 = new Windows();
		os.specs();
		os1.specs();
		os2.specs();
		*/
		// so we want somthing loosly coupled means want to remove this depedency we ewant to create 
		//obj whenever its required and
		//whatever the os i have used will create that spefic object according to requirmemt ok
		
		//so will create and obj of factory method where we implemented ll the logic and wil not show here anything about object creation
		OsFactory osfactory = new OsFactory();
		//here we will jsut pass the name of os which obj we want to create 
		OS obj = osfactory.getInstance("hshsh");
		obj.specs();
	}

}
