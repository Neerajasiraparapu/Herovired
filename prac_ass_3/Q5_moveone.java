import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
        System.out.print("Array size: ");
        int n=s.nextInt();
        System.out.print("ArrNum: ");
        int arrNum[]=new int[n];
        for(int i=0;i<n;i++) {
            arrNum[i]=s.nextInt();
        }
        int i=0,count=0; 
        while(i<n){
            if(arrNum[i]!=1){
                arrNum[count]=arrNum[i];
                count++;
            }
            i++;
        }
        while(count<n){
            arrNum[count]=1;
            count++;
        }
        System.out.print("Array elements after moving: ");
        for(i=0;i<n;i++){
            System.out.print(arrNum[i] + " ");
        }
        }
        catch(Exception e){
            System.out.println("Invalid");
        }
    }
}
