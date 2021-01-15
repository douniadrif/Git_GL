
// 1

public class TestException {

	public static void main ( String[] args ) {
		int x =10 , y=0 , z=0 ;
		try {
			z=x/y ;
		}
		catch (ArithmeticException e ) {
			System.out.println ("Capture de l'exception");
		}
		System.out.println("try another"); 
   }
}
