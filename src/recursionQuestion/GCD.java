package recursionQuestion;

import java.util.Scanner;

// GCD=grested common Division
public class GCD {
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("enter the first number ");
	int input1=sc.nextInt();
	System.out.println("Enter the Second number ");
	int input2=sc.nextInt();
        int ans =gcd(input1,input2);
        System.out.println(ans);
}

private static int gcd(int input1, int input2) {
	// TODO Auto-generated method stub
	if (input1<0||input2<0) {
		return -1;
	}if (input2==0) {
		return input1;
	}
	return gcd(input2,input1%input2);
}
}
