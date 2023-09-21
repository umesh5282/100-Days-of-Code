
// Words that contain many consecutive consonants, like "schtschurowskia", are generally considered somewhat hard to pronounce.
// We say that a word is hard to pronounce if it contains 4 or more consonants in a row;
//  otherwise it is easy to pronounce. For example, "apple" and "polish" are easy to pronounce, but "schtschurowskia" is hard to pronounce
// You are given a string S consisting of N lowercase Latin characters. Determine whether it is easy to pronounce or not based on the rule above — print YES if it is easy to pronounce and NO otherwise
// For the purposes of this problem, the vowels are the characters {a,e,i,o,u} and the consonants are the other 21 characters


package string;
import java.util.Scanner;
public class Day2 {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("input the total number of test input ");
		int t = sc.nextInt();
		while (t-- > 0) {
			System.out.println("string input length");
			int n = sc.nextInt(); // size of string
			sc.nextLine();
			System.out.println("type string ");
			String s = sc.next(); // string input
			s.toLowerCase();
			if (n < 4) {
				System.out.println("YES");
			} else {
				int count = 0;
				for (int i = 0; i < s.length(); i++) {
					if (count == 4) {
						break;
					}
					if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
							|| s.charAt(i) == 'u') {
						count = 0;

					} else {
						count++;
					}
				}
				if (count == 4) {
					System.out.println("NO");

				} else {
					System.out.println("YES");

				}
			}
		}
	}
}
