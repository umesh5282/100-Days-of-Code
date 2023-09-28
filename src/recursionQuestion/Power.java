package recursionQuestion;

import java.util.Scanner;

public class Power {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number ");
	int base =sc.nextInt();
	System.out.println("enter the power of the number ");
	int power=sc.nextInt();
	int ans =power(base,power);
	System.out.println(ans);
}

private static int power(int base, int power) {
	// TODO Auto-generated method stub
	if(power<0) {
		return 0;
	}if (power==0) {
		return 1;
	}
	return base*power(base,power-1);
}
}
