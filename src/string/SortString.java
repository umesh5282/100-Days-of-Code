package string;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
	         	System.out.println("method 1 answer "+Method1(str));
	         	System.out.println("method 2 answer "+ method2(str));
    }
    
    /// method 1:- Without using the sort() method
    public static String Method1(String str) {
    	char arr[]=str.toCharArray();
    	char temp;
    	int i=0;
    	while (i<arr.length) {
    		int j=i+1;
    		while (j<arr.length) {
    			if (arr[j]<arr[i]) {
    			temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    		}
    		j+=1;
    	}
    		i+=1;
      } 
		return new String (arr);
    }
    
    //// method 2:-By using the sort() method
    
    public static String method2(String str) {
    	
    	char tempArray[]=str.toCharArray();
    	
    	Arrays.sort(tempArray);
    	
    	
		return new String(tempArray);
    	
    }
}

