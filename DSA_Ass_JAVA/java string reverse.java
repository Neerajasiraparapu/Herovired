import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int b=A.length();
        String u="";
        for(int i=b-1;i>=0;i--)
        {
            u=u+A.charAt(i);
        }
    
       boolean t;
       t=A.equals(u);
       
        
        if(t==true)
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}



