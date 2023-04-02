import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("*******Console Based Calculator App********");
        char choice='y';
        while(choice=='y') {
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Mulitplication");
            System.out.println("4.Division");
            System.out.println("5.Percentage");
            System.out.println("6.Factorial");
            System.out.println("7.Square");
            System.out.println("8.Cube");
            System.out.println("9.Square root");
            System.out.println("10.a Power b");
            System.out.println("11.a Root b");
            System.out.println("Enter the option:");
            int opt=s.nextInt();
            int a,b;
            switch(opt){
                case 1:
                    System.out.print("Enter a,b numbers: ");
                    a=s.nextInt();
                    b=s.nextInt();
                    System.out.println("Addition a,b is: " +(a+b));
                    break;
                case 2:
                    System.out.print("Enter a,b numbers: ");
                    a=s.nextInt();
                    b=s.nextInt();
                    System.out.println("Subtraction  a,b is: " +(a-b));
                    break;
                case 3:
                    System.out.print("Enter a,b numbers: ");
                    a=s.nextInt();
                    b=s.nextInt();
                    System.out.println("Mulitplication a,b is: " +(a*b));
                    break;
                case 4:
                    System.out.print("Enter a,b numbers: ");
                    a=s.nextInt();
                    b=s.nextInt();
                    System.out.println("Division a,b is: " +(a/b));                    
                    break;
                case 5:
                    System.out.print("Enter a,b number: ");
                    a=s.nextInt();
                    b=s.nextInt();
                    float percentage=((float) a/b)*100;
                    System.out.printf("The Percentage is: %.2f\n",percentage);
                    break;
                case 6:
                    Long factorial=1l;
                    System.out.print("Enter number: ");
                    a=s.nextInt();
                    for(int i=1;i<=a;i++){
                        factorial*=(long) i;
                    }
                    System.out.println("The factorial is: "+factorial);
                    break;
                case 7:
                    System.out.print("Enter number: ");
                    a=s.nextInt();
                    int square=(int)Math.pow(a,2);
                    System.out.println("Square number is: "+square);
                    break;
                case 8:
                    System.out.print("Enter number: ");
                    a=s.nextInt();
                    int cube=(int)Math.pow(a, 3);
                    System.out.println("Cube number is: " +cube);
                    break;
                case 9:
                    System.out.print("Enter number: ");
                    a=s.nextInt();
                    double sqroot=(double)Math.pow(a,0.5);
                    System.out.println("Square Root number is: " +sqroot);
                    break;
                case 10:
                    System.out.print("Enter a,b numbers: ");
                    a=s.nextInt();
                    b=s.nextInt();
                    int power=(int)Math.pow(a,b);
                    System.out.println("a Power b is: " +power);
                    break;
                case 11:
                    System.out.print("Enter a,b operands: ");
                    a=s.nextInt();
                    b=s.nextInt();
                    System.out.println("a Root b is: " +Math.pow(a,1/(float)b));
                    break;
            }
            System.out.print("Do you want to continue (y/n): ");
            choice=s.next().charAt(0);
        }
        System.out.println("successfully completed");
    }
}
