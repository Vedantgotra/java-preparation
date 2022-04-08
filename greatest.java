package vedant;
import java.util.*;
public class greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a,b,c;
       Scanner sc =new Scanner(System.in);
       System.out.print("ENTER THE FIRST NO");
       a= sc.nextInt();
       System.out.print("ENTER THE SECOND NO");
       b=sc.nextInt();
       System.out.print("ENTER THE THIRD NO");
       
       c=sc.nextInt();
       if(a>b&&a>c) 
    	   System.out.println(a+"is Greatest");
       else	if(b>c&&b>a)
    		System.out.println(b+"is greatest");
       else
    	   System.out.println(c+"is greatest");
              
	}

}
