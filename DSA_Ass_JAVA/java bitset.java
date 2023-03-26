import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void bitSetOperate(String query, String n1, String n2, BitSet b1, BitSet b2){

        switch(query){
            case "AND":
                if(n1.compareTo(n2) > 0){
                    b2.and(b1);
                }else{
                    b1.and(b2);
                }
                break;
            case "OR":
                if(n1.compareTo(n2) > 0){
                    b2.or(b1);
                }else{
                    b1.or(b2);
                }
                break;
            case "XOR":
                if(n1.compareTo(n2) > 0){
                    b2.xor(b1);
                }else{
                    b1.xor(b2);
                }
                break;
            case "FLIP":
                if(n1.equals("1")){
                    b1.flip(Integer.valueOf(n2));
                }else{
                    b2.flip(Integer.valueOf(n2));
                }
                break;
            case "SET":
                if(n1.equals("1")){
                    b1.set(Integer.valueOf(n2));
                }else{
                    b2.set(Integer.valueOf(n2));
                }
                break;
        }
        System.out.printf("%s %s\n", b1.cardinality(), b2.cardinality());
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet bits1 = new BitSet(n);
        BitSet bits2 = new BitSet(n);
        
        while(m-- > 0){
            String query = sc.next();
            String n1 = sc.next();
            String n2 = sc.next();
            bitSetOperate(query, n1, n2, bits1, bits2);
        }
    }
}
