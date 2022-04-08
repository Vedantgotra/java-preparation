package vedant;

public class Cla {
	public static void main(String args[])
	{
		int sum=0;
		System.out.println(args.length);
		for(int i=0;i<args.length;i++)
		{
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println("The Sum of Value are "+ sum);
	}
}
