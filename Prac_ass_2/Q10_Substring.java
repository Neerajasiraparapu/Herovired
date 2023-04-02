import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    try{	
		System.out.print("String Name:");
		String str=s.next();
		System.out.print("Starting index:");
		int start=s.nextInt();
		System.out.print("Ending index:");
		int end=s.nextInt();
		System.out.println("subString of "+str+ "from "+start+" to " +end+ " is: "+str.substring(start,end+1));
	    }
            catch(Exception e){
		    System.out.println("Invalid");
	    }		    
	}
}
