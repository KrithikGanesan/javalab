package is077;

import java.util.*;
public class sumofdigit
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n= scan.nextInt();
		System.out.println(arsum(n));
	}
	
	static int arsum(int n)
	{
		
		int sum=0;
		while(n>0||sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	
}