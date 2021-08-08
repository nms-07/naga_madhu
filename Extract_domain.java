package revature_programs;

public class Extract_domain {

	public static void main(String[] args) {
		
		String s = "https://en.wikipedia.org/Main_Page";
		String st[] = s.split("/");
		System.out.println(st[2]);

	}

}
