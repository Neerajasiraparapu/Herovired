import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.print("num1:");
		int a=s.nextInt();
		System.out.print("num2:");
		int b=s.nextInt();
		System.out.print("num3:");
		int c=s.nextInt();
		int temp1=a<b?a:b;
		int smallest=c<temp1?c:temp1;
		System.out.println("The smallest Number:"+smallest);
		int temp2=a>b?a:b;  
		int largest=c>temp2?c:temp2;  
		System.out.println("The Largest Number:"+largest);
		int avg=(a+b+c)/3;
		System.out.println("Average of all three numbers:"+avg);
	}
}
