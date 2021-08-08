package revature_programs;

public class Check_safety {

	public static void main(String[] args) {
		
		String s = "https://en.wikipedia.org/Main_Page";
		String st = (s.contains("https")) ? "Secure" : "Not Secure";
		System.out.println(st);
		
		
		
	}

}
