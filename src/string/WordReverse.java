package string;

import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentance");
		String str =sc.nextLine();
		 String SplitArray[]=str.split(" ");
		 for(int i=SplitArray.length-1;i>=0;i--) {
			 System.out.println(SplitArray[i]);
		 }
		}
}
