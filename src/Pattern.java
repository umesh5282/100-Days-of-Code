import java.util.Scanner;

public class Pattern {

//question 1
//  input =5
// output
// *
// **
// ***
// ****
// *****    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input value");
		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

//quetion 2 
//input =5
// /*
// output 
// *****
// ****
// ***
// **
// *   */

	class Pattern2 {
		public static void main(String[] args) {
			int input = 5;
			for (int i = input; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}
