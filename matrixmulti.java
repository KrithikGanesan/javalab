package is077;

public class matrixmulti
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no.of rows");
		int m=scan.nextInt();
		System.out.println("Enter the no.columns");
		int n=scan.nextInt();
		int i,j,k;
		int [][] d=new int [m][n];
		System.out.println("Enter matrix elements");
		for(i=0;i<n;i++)
		{
			for (j=0;j<m;j++)
			{
				d[i][j]=scan.nextInt();
				
			}
		}
		
		System.out.println("Enter the no.of rows2");
		int x=scan.nextInt();
		System.out.println("Enter the no.columns2");
		int y=scan.nextInt();
		int [][] f=new int [x][y];
		int [][] product=new int [10][10];
		System.out.println("Enter matrix2 elements");
		for(i=0;i<y;i++)
		{
			for (j=0;j<x;j++)
			{
				f[i][j]=scan.nextInt();
				
			}
		}
		if(n!=x)
		{
			System.out.println("multiplication not possible");
		}
		else
		{
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					for(k=0;k<y;k++)
					{
						product[i][j]+=d[i][k] * f[k][j];
					}
				}
			}
		
			System.out.println("product matrix");
			for(i=0;i<m;i++)
			{
				for(j=0;j<y;j++)
				{
					System.out.println(product[i][j]+" ");
				}
				System.out.print("\n");
			}
		}
			
	}
}	
		