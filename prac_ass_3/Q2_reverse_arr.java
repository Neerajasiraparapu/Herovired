import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        try{
        int n=s.nextInt();
        System.out.print("arrNum:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("The elements in reverse order - ");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        }
        catch(Exception e){
            System.out.println("Invalid number");
        }    
    }
} 
