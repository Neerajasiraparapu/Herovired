import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char c='y';
        while(c!='n') {
            try{
            System.out.println("Menu based app - Unit conversion for Distance");
            System.out.println("1. CM to M");
            System.out.println("2. M to KM");
            System.out.println("3. KM to M");
            System.out.println("4. M to CM");
            System.out.print("Enter your menu - ");
            int menu=s.nextInt();
            switch(menu){
                case 1:
                    System.out.print("Please enter the CM value: ");
                    int CM=s.nextInt();
                    System.out.println(CM+" CM = "+((float)CM/100)+" M");
                    break;
                case 2:
                    System.out.print("Please enter the M value: ");
                    int M=s.nextInt();
                    System.out.println(M+" M = "+((float)M/1000)+" KM");
                    break;
                case 3:
                    System.out.print("Please enter the KM value: ");
                    float KM=s.nextInt();
                    System.out.println(KM+" KM = "+(KM*1000)+" M");
                    break;
                case 4:
                    System.out.print("Please enter the M value: ");
                    float Mtr=s.nextInt();
                    System.out.println(Mtr+" M = "+(Mtr*100)+" CM");
                    break;
                default:
                    System.out.println("Enter valid Option!");
                    c=s.next().charAt(0);
            }
            System.out.print("Do you want to Continue: ");
            c=s.next().charAt(0);
            }
            catch(Exception e){
                System.out.println("Invalid");
            }
        }
    }
}
