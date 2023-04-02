import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    try{
		    System.out.print("num:");
		    int num=s.nextInt();
		    for(int i=1;i<=10;i++){
		        System.out.println(num+" X "+i+" = "+(num*i));
		    }
	    }
	    catch(Exception e){
	        System.out.println("Invalid number");
	    }
	}
}
