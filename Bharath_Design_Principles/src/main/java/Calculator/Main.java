package Calculator;
import java.util.*;
public class Main {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		try
		{
		int a=input.nextInt();
		int b=input.nextInt();
		Calculation h=new Calculation();
		int Add=h.add(a, b);
		int s=h.sub(a, b);
		int m=h.mul(a, b);
		int d=h.div(a, b);
		
		System.out.println(Add);
		System.out.println(s);
		System.out.println(m);
		System.out.println(d);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		
		
		
	}
	
	
	
	
}
