// Remove the duplicates in an array


package revature_programs;

public class Remove_arr_dup {

	public static void main(String[] args) {
	
		int a[] = {1,1,2,3,4,4,5,6,6};
		StringBuilder sb = new StringBuilder();
		for (int i = 0;i<a.length;i++) {
			if (sb.toString().contains(String.valueOf(a[i]))) {
				continue;
			}
			else {
				sb.append(a[i]);
				sb.append(" ");
			}
		}
//		String[] w= sb.toString().split("\\s"); 			
//		int d[] = new int[w.length];
//		for (int i = 0;i<w.length;i++) {	     -----------To get array as an output!
//			d[i] = Integer.parseInt(w[i]);
//			System.out.print(d[i]+" ");
		
		System.out.println(sb);

	}
}
