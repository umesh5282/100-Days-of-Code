package recursionQuestion;

import java.util.Scanner;

public class DecimalToBinary {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int input =sc.nextInt();
	System.out.println("Binary number of given number "+ input+ " is "+decimaltoBinary( input)); 
}

private static int decimaltoBinary(int n) {
	// TODO Auto-generated method stub
	if(n==0) {
		return 0;
	}
	return n%2+10*decimaltoBinary(n/2);
}
}
