//Program to find palindrome of a string and reverse it if is not a palindrome
//
//It checks every word and reverse the word in same position



package revature_programs;
import java.util.*;

public class Palindrome_reverse {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		String s = scan.nextLine();
		String s = "raar hii good noon hope we get thread safety";
		npalrev(s);
	}
	
	
	//Method to print all the words by checking each word
	
	public static void npalrev(String s) {
		String[] st = s.split("\\s");
		for(int i =0;i<st.length;i++) {
			isPal(st[i]);		//checking every word here
		}
	}
	
	//Method to check each word is a palindrome or not
	
	public static void isPal(String s){
		StringBuilder sb = new StringBuilder(s);
		if (!sb.toString().equals(sb.reverse().toString())) {  
			System.out.print(sb.toString());
			System.out.print(" ");
		}
		else {
			System.out.print(sb.toString());
			System.out.print(" ");
		}
	}
}
