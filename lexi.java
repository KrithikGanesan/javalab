package is077;

public class lexi
{
	public static void main(String args[])
	{
		int i;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter 5 string");
		String[] words=new String[5];
		for(i=0;i<5;i++)
		{
			words[i]=scan.nextLine();
		}
		for(i=0;i<4;++i)
		{
			for(int j=i+1;j<5;++j)
			{
				if (words[i].compareTo(words[j])>0)
				{
					String temp=words[i];
					words[i]=words[j];
					words[j]=temp;
				}
			}
		}
		System.out.println("lexigographical order is:");
		for(i=0;i<5;i++)
		{
			System.out.println(words[i]);
		}
	}
}