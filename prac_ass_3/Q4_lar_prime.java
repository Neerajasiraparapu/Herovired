import java.util.*;
public class Main
{
    public static boolean isPrime(int a){
        if(a<=1){
		   return false; 
		}
		for(int i=2;(i*i)<=a;i++){
		    if(a%i==0){
		        return false;
		    }
		}
		return true;
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
        try{	
		int n=s.nextInt();
		System.out.print("arrNum:");
		int arrNum[]=new int[n];
		for(int i=0;i<n;i++){
		    arrNum[i]=s.nextInt();
		}
		boolean flag = false;
		int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(isPrime(arrNum[i])){
                if(ans<arrNum[i]){
                    ans=arrNum[i];
                    flag=true;
                }
            }
        }
        if(flag){
            System.out.println("The Largest Prime Number in the given array: "+ans);
        }else{
            System.out.println("No prime number");
        }
	    }
	    catch(Exception e){
		    System.out.println("Invalid number");
	    }	    
	}
}
