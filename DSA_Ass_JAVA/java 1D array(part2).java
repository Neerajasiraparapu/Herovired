import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int[] sum=new int[n];
        int count=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                sum[j] +=arr[i];
                count+=sum[j]>=0?0:1;
            }
        }
        System.out.println(count);
    }
}
