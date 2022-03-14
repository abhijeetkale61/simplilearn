package program;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string:");
		String s =sc.nextLine();
		String str =s.toUpperCase();
		int count =0;
		int length = str.length();
		
		for(int i = 0;i<length - 1; i++){
			if(str.charAt(i)==str.charAt(i+1))
			
			System.out.println(" Count = " + count);
		}
		

	}
}
