package assistedproject;

public class stringdemo {
	public static void main(String[] args) {
	
		System.out.println("Methods of Strings");
		String sl=new String("Hello");
		System.out.println(sl.length());

		
		String sub=new String("hii");
		System.out.println(sub.substring(2));

	
		String s1="Hii";
		String s2="Heldo";
		System.out.println(s1.compareTo(s2));

		
		String s4="";
		System.out.println(s4.isEmpty());

		
		String s5="Hello";
		System.out.println(s1.toLowerCase());
		
		
		String s6="Heldo";
		String replace=s2.replace('d', 'l');
		System.out.println(replace);
		
		String x="Welcome to string";
		String y="WeLcOmE tO string";
		System.out.println(x.equals(y));
 
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Enjoy your learning");
		System.out.println(s);
	}
}


