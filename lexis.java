package is077;

import java.util.*;
public class lexis
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String [] ls=new String[5];
		System.out.println("enter 5 strings");
		for(int i=0;i<5;i++)
		{
			ls[i]=scan.next();
		}
		Arrays.sort(ls);
		for(int i=0;i<5;i++)
		{
			System.out.println(ls[i]);
		}
	}	
}
	