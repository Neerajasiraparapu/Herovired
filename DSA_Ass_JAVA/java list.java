

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> li=new LinkedList<>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n-->0){
            int v=s.nextInt();
            li.add(v);
            
        }
        int t=s.nextInt();
        while(t-->0){
            String str=s.next();
            if(str.equals("Insert")){
                int a=s.nextInt();
                int b=s.nextInt();
                li.add(a,b);
            }
            else{
                int x=s.nextInt();
                li.remove(x);
            }
        }
        for(Integer i:li){
            System.out.print(i+" ");
        }
    }
}
