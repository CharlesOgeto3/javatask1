/*chalo


*/

package chalo;//name of our folder
import java.util.Scanner;//// It is the easiest way to read input in a Java program
public class divisibility_test {//here is the class name
public static void main(String[]args)//this is the main function

{
	int number;
	Scanner input =new Scanner(System.in);
	System.out.print("hey child,kindly enter the number to be tested");
	number=input.nextInt();//allows input from the user

	System.out.print("\n");//this is the line break
if (number  %2==0) //the if function
{
	System.out.println(number+" is divisible by 2");
}

else if (number  %3==0) 
{
	System.out.println(number+ "is divisible by 3");
}		
if (number  %4==0) 
{
	System.out.println(number+ " is divisible by 4");
}
else if (number  %5==0) 
{
	System.out.println(number+ " is divisible by 5");
}
else if (number  %6==0) 
{
	System.out.println(number_entered+ "is divisible by 6");
}
else if (number  %7==0) 
{
	System.out.println(number+ " is divisible by 7");
}
else if (number  %8==0) 
{
	System.out.println(number+ "  is divisible by 8");
}
else if (number  %9==0) 
{
	System.out.println(number+ " is divisible by 9");
}
else 
{
	System.out.println(number+ "is not within 0-9 divisibility");
}
System.out.print("\n");
}
}
