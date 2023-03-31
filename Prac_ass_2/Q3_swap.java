import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.print("numA:");
		int a=s.nextInt();
		System.out.print("numB:");
		int b=s.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("numA:"+a);
		System.out.println("numB:"+b);
	}
}
