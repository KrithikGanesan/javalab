package is077;

import java.util.Scanner;


public class happynum{

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
System.out.print("Enter a positive number: ");
int number = sc.nextInt();
A.B.callMe(number);
	}

}
interface  A{
	interface B{
		static void callMe(int number) {
			int sum = number;
			while (sum>9) {
				int temp=sum;
				int fin=0;;
				while(temp!=0) {
					fin+= Math.pow(temp % 10,2);
					temp/=10;
				}
				sum = fin;
				}
			if(sum==1) {
				System.out.println(number+"is a happy number.");
			}else {
				System.out.println(number+"is not a happy number.");
			}
		}
	}
