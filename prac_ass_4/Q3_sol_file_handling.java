import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        
        try{
            int a=scan.nextInt();
            int b=scan.nextInt();
            int c;
            c=a/b;
            System.out.println(c);
        }
        catch(InputMismatchException ie){
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
