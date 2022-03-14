package assistedproject;
import java.util.*;
public class collection {
	public static void main(String[] args) {
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
		city.add("Bangalore");//
	      city.add("Delhi");    	   
	      System.out.println(city);  
		
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(50); 
	      vec.addElement(15); 
	      System.out.println(vec);
		
	}
}
