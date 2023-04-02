
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num;
        char ch='y';
        while(ch!='n'){
            try{
                System.out.println("\nMenu based app - Even/Odd Checker");
                System.out.print("Please enter the number: ");
                num=s.nextInt();
                System.out.print("The given number - ");
                System.out.println((num & 1)==1?num+" is a ODD number":num+" is an EVEN number");
                System.out.print("Do you want to Continue: ");
                ch=s.next().charAt(0);
                if(ch=='n'||ch!='y'){
                    break;
                }
            }
            catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }
}
