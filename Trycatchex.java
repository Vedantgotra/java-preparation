package vedant;

public class Trycatchex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
        int sum=100/0;
         System.out.println(sum);
          
		}
		catch(ArithmeticException e) {
		System.out.println(e);	
		}
		finally {
			System.out.println("this block will always run");
		}
		System.out.println("hello this is rest of the code");
		}
	}


