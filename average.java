/* charles ogeto*/
package Charles;
import java.util.Scanner;// It is the easiest way to read input in a Java program
public class Average {

	public static void main(String[]args)
	{//introduction of variables to to thir data types
		int C,data_structure,networking,Financial,entrepreurship, total;
		double average;
		
	Scanner input=new Scanner(System.in);//(System .in )allows inputing of values
	System.out.println("enter your programming marks");
	C=input.nextInt();// user inputs values
	System.out.println("enter your data structure");
	data_structure=input.nextInt();
	System.out.println("enter your networking");
	networking=input.nextInt();
	System.out.println("enter your financial mnagment");
	Financial=input.nextInt();
	System.out.println("enter your entrepreuship");
	entrepreurship=input.nextInt();
	total=C+data_structure+networking+Financial+entrepreurship;
	average=sum/5;
	System.out.printf(" your average is:"+average);
	

	}
	
	
	

}
