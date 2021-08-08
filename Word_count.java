package revature_programs;

import java.util.*;

public class Word_count {

	public static void main(String[] args) {
		System.out.println("Vowel Count");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		countvowel(s);
	}
	public static void countvowel(String s) {
		Map<Integer, String>map=new TreeMap<>();
		String arr[]=s.split(" ");
		int k;
		for(String i:arr) {
			k=0;
			for(int j=0;j<i.length();j++) {
				if(i.charAt(j)=='a' || i.charAt(j)=='e' || i.charAt(j)=='i' || i.charAt(j)=='o' || i.charAt(j)=='u' || i.charAt(j)=='A' || i.charAt(j)=='E' || i.charAt(j)=='I' || i.charAt(j)=='O' || i.charAt(j)=='U') {
					k=k+1;
				}
			}
			if(map.containsKey(k)) {
				StringBuilder sb=new StringBuilder(map.get(k));
				StringBuilder sb1=new StringBuilder(i);
				String s2=sb.reverse().toString()+" "+sb1.reverse().toString();
				map.remove(k);
				map.put(k,s2);
			}
			else {
				map.put(k,i);
			}
		}
		System.out.println(map);
	}
}
