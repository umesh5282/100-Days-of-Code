package string;

import java.util.Scanner;

public class CountWord {
   public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the String");
	String s =sc.nextLine();
	int count =countNumberOfWOrd(s);
	System.out.println("number of words in String ="+count);
}
   private static int countNumberOfWOrd(String s) {
	// TODO Auto-generated method stubt
	   int count=0;
	   if (s.charAt(0)!=' ') {
		   count++;
	   }
	   for (int i=0;i<s.length();i++) {
		   if (s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
			   count++;
		   }
	   }
	return count;
   }
}
