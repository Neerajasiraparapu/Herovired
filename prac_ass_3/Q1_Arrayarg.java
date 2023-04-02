import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    try{
	    int n=s.nextInt();
		System.out.print("ArrNum:");
		int	arrNum[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
		    arrNum[i]=s.nextInt();
		    sum+=arrNum[i];
		}
		int min=999999, max=-999999,avg=0;
		avg=sum/n;
	    for(int i=0;i<n;i++){
	        if(arrNum[i]<min){
	            min=arrNum[i];
	        }
	    }
	    for(int i=0;i<n;i++){
	        if(arrNum[i]>max){
	            max=arrNum[i];
	        }
	    }
	    System.out.println("The element with the Minimum value:"+min);
	    System.out.println("The element with the Maximum value:"+max);
	    System.out.println("Average of all array elements:"+avg);
	    System.out.println("Total number of array elements:"+n);
	    }catch(Exception e){
	        System.out.println("Invalid");
	    }
	}
}
