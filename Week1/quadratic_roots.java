import java.lang.*;
import java.util.*;

class quadratic_roots{
	public static void main(String args[])
	{
		float a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		double r1,r2;
		double d=b*b-4*a*c;
		if(d>=0)
		{
			r1=(-b+Math.sqrt(d))/(2*a);
			r2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("real roots are"+r1+""+r2);
		}
		else{
			d=Math.sqrt(d);
			System.out.println("imaginary roots are"+(-b/(2*a))+"+i"+d+"and"+(-b/(2*a))+"-i"+d);
		}
	}
}