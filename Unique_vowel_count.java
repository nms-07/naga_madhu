package revature_programs;

import java.util.*;

public class Unique_vowel_count {

	private static final String String = null;

	public static void main(String[] args) {
		
		System.out.println("UniqueVowelCount");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		findnuiqvow(s);
	}

	public static void findnuiqvow(String s) {
		int k=0;
		String arr[]= {"a","e","i","o","u","A","E","O","U"};
		String a[]=s.split(" ");
		Set<String> set=new HashSet<String>();
		Map<Integer, String> map=new TreeMap<Integer,String>();
		for(String i1:a) {
			set.clear();
			String b[]=i1.split(""); 
			for(String j:b) {
				set.add(j);
			}
			k=0;
			for(String i:arr) {
				if(set.contains(i)) {
					k++;
				}
			}
			if(map.containsKey(k)) {
				String s1=map.get(k);
				s1=s1+" "+i1;
				map.remove(k);
				map.put(k, s1);
			}
			else {
				map.put(k, i1);
			}
		}
		System.out.println(map);
	}

}
