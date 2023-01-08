package FileandTransientKeyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientKeywordExmp implements Serializable{
	
	//Normal Instance variables 
	int i=10,j=20;
	
	//transient variables
	transient int k=30;
	transient int l= 40;
	
//	transient keyword is no impact here becase be added static and final so
//	it would work as a noraml var if we use static or final with transient so
//	 we cant use static or final var with transient 	
	transient static int m= 50;
	transient final int n =60;

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		//serialization
		TransientKeywordExmp input = new TransientKeywordExmp();
		
		//write file
		FileOutputStream fos = new FileOutputStream("C:\\Users\\RahulKumar\\Desktop\\filevls11.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(input);
 		System.out.println("File written1");
 		
 		//readfile
 		FileInputStream fis = new FileInputStream("C:\\Users\\RahulKumar\\Desktop\\filevls11.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		TransientKeywordExmp output =  (TransientKeywordExmp) ois.readObject();
 		System.out.println("File fileRead");
 		System.out.println(" normal var i : "+ output.i);
 		System.out.println(" normal var j : "+ output.j);
 		System.out.println("impact of transient  not a part of serilization so retun default vlaue k : "+ output.k);
 		System.out.println("impact of transient  not a part of serilization so retun default vlaue l : "+ output.l);
 		System.out.println("transient no impact because of static for var m : "+ output.m);
 		System.out.println("transient no impact because of final for var n : "+ output.n);
	}
}
