package is077;

public class matrix
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=scan.nextInt();
			if(n<=0)
			{
				System.out.println("invalid");
			}
			else
			{
				int sum=0;
				while(n!=0)
				{
					sum+=n*n;
					n--;
				}
				System.out.println("total no.of squares in n*n matrix is"+sum);
			}
		
	}
}