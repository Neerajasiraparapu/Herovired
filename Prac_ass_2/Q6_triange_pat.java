import java.util.Scanner;
 
public class Main
{
    public static void main(String[] args)
    {
     try{
        for(int i=0;i<=7;i+=2)
        {
            for(int j=0;j<=i-2; j++) 
            { 
                System.out.print("*"+ " ");
            } 
            System.out.println(""); 
            
        } 
        for(int i=7;i>=0;i-=2)
        {
            for(int j=0;j<=i-1;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
     }
     catch(Exception e){
      System.out.println("Invalid");
     } 
    }
}
 
