

import java.util.Scanner;
 
public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        try{
            for(int i=n;i>=0;i--)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
            for(int i=1;i<=n;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
        }
        catch(Exception e){
            System.out.println("Invalid");
        } 
    }
}
 
