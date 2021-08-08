// Change the last letter of every word into uppercase of a given string


package revature_programs;
import java.util.*;

public class Lastletter_up {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String s = scan.nextLine();
		String s = "hello hii good noon hope we get thread safety";
		lastletter(s);

	}
	
	public static void lastletter(String s) {
		
		StringBuilder sb = new StringBuilder();
		String st[]=s.split(" ");
		for (int i = 0; i < st.length; i++) {
			sb.append(st[i].substring(0,st[i].length()-1)).append(Character.toUpperCase(st[i].charAt(st[i].length()-1))).append(" ");
				
		}
		System.out.println(sb);
	}
}
