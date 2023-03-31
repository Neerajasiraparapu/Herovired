import java.util.Scanner;
 
public class Main
{
    public static void main(String[] args)
    {
        for(int i=0;i<=5;i+=2)
        {
            for(int j=0;j<=i-2; ++) 
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
}
 
