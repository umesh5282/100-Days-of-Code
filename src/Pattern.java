import java.util.Scanner;

//public class Pattern {
//
////question 1
////  input =5
//// output
//// *
//// **
//// ***
//// ****
//// *****    
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the input value");
//		int input = sc.nextInt();
//		for (int i = 0; i < input; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
//
//	}
//
////quetion 2 
////input =5
//// /*
//// output 
//// *****
//// ****
//// ***
//// **
//// *   */
//
//	class Pattern2 {
//		public static void main(String[] args) {
//			int input = 5;
//			for (int i = input; i > 0; i--) {
//				for (int j = 0; j < i; j++) {
//					System.out.print("*");
//				}
//				System.out.println("");
//			}
//		}
//	}
//}

  class Pattern {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
         System.out.println("enter the input ");
        int input =sc.nextInt();
         Pattern pq=new Pattern();

         System.out.println('\n'+"//////////////patter1////////////// "+'\n' );
         pq.pattern1(input );
         System.out.println('\n'+"//////////////pattern 2////////////"+'\n');
         pq.pattern2(input);
        System.out.println('\n'+"///////////////pattern 3 ///////////"+'\n');
         pq.pattern3(input);
          System.out.println('\n'+"/////////////pattern 4 //////////"+'\n');
         pq.pattern4(input);
          System.out.println('\n'+"/////////////pattern 5//////////////"+'\n');
         pq.pattern5(input);
         System.out.println('\n'+"//////////////pattern 6//////////////"+'\n');
         pq.pattern6(input);
    }
    public void pattern1(int n){
          for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
           
        }
        
    }

     public  void pattern2 (int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void pattern3(int n){
         for (int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
         }
    }

    public void pattern4(int n){
        for (int i=0;i<n;i++){
              for ( int j=0;j<=i;j++){
                System.out.print(" ");
              }
              for (int k =n;k>i;k--){
                System.out.print("*"+" ");
              }
              System.out.println(" ");
        }
    }

    public void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                   System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=n;k>i;k--){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }

    
    public void pattern6(int n){
        
        for(int k=n;k>0;k--){
            for(int j=0;j<k;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

      for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
             System.out.print("*");
        }
        System.out.println(" ");
      }
    }

}   


