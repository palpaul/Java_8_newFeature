import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;   
	public class array  
	{   
	public static void main(String[] args)   
	{   
	//defining an array of integer type   
	int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
	
	 ArrayList<Integer>arlist = new ArrayList<>();
	 arlist.add(12);
	 arlist.add(2);
	 arlist.add(28);
	 arlist.add(1);
	 ArrayList<Integer>arlistSorted = new ArrayList<>();
	 
	 
	// arlistSorted.sort(c);
	 
	//invoking sort() method of the Arrays class  
	Arrays.sort(array);   
	System.out.println("Elements of array sorted in ascending order: " +array);  
	//prints array using the for loop  
	for (int i = 0; i < array.length; i++)   
	{       
	System.out.println(array[i]);   
	}   
	}
	}


