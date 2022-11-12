/* charles ogutu
 * this program allows display of multiple of 2,3,and seven within the range of  71 to 150
 * 
*/

package Charles;//the source folder

public class multiples{
   	public static void main(String args[]) {
		System.out.println("\nmultiples of 2: ");		
		for (int i=71; i<150; i++) {//am using or loop beacause it is efficient than while and do while
			if (i%2==0) 
			System.out.print(i +", ");			
		}
		System.out.println("\nmultiple of 3: ");		
		for (int i=71; i<150; i++) {
			if (i%3==0) 
			System.out.print(i +", ");			
		}
				
		System.out.println("\n\nmultiples of 7: ");
		for (int i=71; i<150; i++) {
			if (i%5==0) System.out.print(i +", ");			
		}
				
		
		System.out.println("\n");//line break
  }
}



