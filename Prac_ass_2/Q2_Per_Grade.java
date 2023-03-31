import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;  
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("Marks Obtained by a Student:");
		int Marks=s.nextInt();
		System.out.println("Total Marks:");
		int TotalMarks=s.nextInt();
		float Percentage=((float)(Marks*100)/TotalMarks);
		System.out.println("Percentage:"+String.format("%.2f", Percentage)+"%");
		if(Percentage>=0 && Percentage<=59){
		    System.out.println("Grade-F,GPA=0.0");
		}
		else if(Percentage>=60 && Percentage<=69){
		    System.out.println("Grade-D,GPA=1.0");
		}
		else if(Percentage>=70 && Percentage<=79){
		    System.out.println("Grade-C,GPA=2.0");
		}
		else if(Percentage>=80 && Percentage<=89){
		    System.out.println("Grade-B,GPA=3.0");
		}
		else if(Percentage>=90 && Percentage<=100){
		    System.out.println("Grade-A,GPA=4.0");
		}
	}
}
