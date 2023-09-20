/*
           given a number N and count Factors in that 
             input =8
             output = 1,2,4,8
             
 */

public class day1 {
                 /// simple method 1
	public static void main(String[] args) {	
//	day1.countFactor(8);
	day1.countFactorN(24);
	
	}
	public static void countFactor(int n) {
		for(int i=1;i<=n;i++) {
			if (n%i==0) {
				System.out.println(i);
			}
		}
			
	}
	    // optimize method
	public static void countFactorN(int n) {
		for (int i=1;i<=Math.sqrt(n);i++) {
			if (i==n/i) {
				System.out.println(i);
				}
			else {
			 	System.out.print(i+","+ n/i+",");
			 	
			}
		}
		
	}
	
}
