package assistedproject;

public class thread {
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		Thread mt = new Thread();
  		mt.start();
 	}
}


