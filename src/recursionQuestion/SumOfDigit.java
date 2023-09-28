package recursionQuestion;

import java.util.Scanner;

public class SumOfDigit {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number ");
	int input=sc.nextInt();
	int ans= Sumofdigit(input);
	 System.out.println(ans);
}
public static  int Sumofdigit(int n) {
	if (n==0||n<0) {
		return 0;

	}
	return n%10+Sumofdigit(n/10);
	
}
}
