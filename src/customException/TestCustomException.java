package customException;

import java.util.Scanner;

import org.junit.platform.commons.util.StringUtils;

public class TestCustomException {
	
	//here we are calling this customException(NameNotFoundException) which we created ok
	static void validateName(String name) throws NameNotFoundException{
		if(StringUtils.isBlank(name)) {
			throw new NameNotFoundException("name is not found");
		}
		else System.out.println("Name found welcome-- " +name);
		
		
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the name if you are not enter then you will get custom Exception name not found exception ok");
			//calling the method which is using the custom exception
			validateName(sc.nextLine());
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Caught the name not found exception");
			System.out.println("Exception occured"+e);
		}
	}
}
