import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.print("num:");
		int a=s.nextInt();
		int flag=0;
		if(a==1||a==0){
		    System.out.println("The given number "+a+" is NOT a Prime number");
		}
		else{
		    for(int i=2;(i*i)<=a;i++){
		        if(a%i==0){
		            flag=1;
		            break;
		        }
		    }
		    if(flag==0){
		        System.out.println("The given number "+a+" is a Prime number");
		    }
		    else{
		        System.out.println("The given number "+a+" is NOT a Prime number");
		    }
		}    
	}
}
