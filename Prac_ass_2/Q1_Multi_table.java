import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("num:");
		int num=s.nextInt();
		for(int i=1;i<=10;i++){
		    System.out.println(num+" X "+i+" = "+(num*i));
		}
	}
}
