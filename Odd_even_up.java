// Progrsam to make last letter of a word in the given string uppercase if the length is even or middle char of word uppercase 
// if word length is odd.

package revature_programs;
import java.util.*;

public class Odd_even_up {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String s = scan.nextLine();
		String s = "hello hii good noon hope we get thread safety";
		oddevenCase(s);

	}
	
	public static void oddevenCase(String s) {
		
		StringBuilder sb = new StringBuilder();
		String st[]=s.split(" ");
		for (int i = 0; i < st.length; i++) {
			if (st[i].length()%2==0) {
				sb.append(" ");
				sb.append(st[i].substring(0,st[i].length()-1)).append(Character.toUpperCase(st[i].charAt(st[i].length()-1)));
				
			}
			else {
				sb.append(" ");
				int mid = st[i].length()/2;
				sb.append(st[i].substring(0,mid)).append(Character.toUpperCase(st[i].charAt(mid))).append(st[i].substring(mid+1));
			}
		}
		System.out.println(sb.toString().trim());
		
	}

}
