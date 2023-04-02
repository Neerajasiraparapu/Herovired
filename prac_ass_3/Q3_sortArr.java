import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        try{
        int n=s.nextInt();
        System.out.print("arrNum:");
        int arrNum[]=new int[n];
        for(int i=0;i<n;i++){
            arrNum[i]=s.nextInt();
        }
        Arrays.sort(arrNum);
        System.out.print("The elements in ascending order: ");
        for(int i=0;i<n;i++){
            System.out.print(arrNum[i]+" ");
        }
        System.out.println();
        System.out.print("The elements in descending order: ");
        for(int i=n-1;i>=0;i--){
            System.out.print(arrNum[i]+" ");
        }
        }
        catch(Exception e){
            System.out.println("Invalid number");
        }    
    }
} 
