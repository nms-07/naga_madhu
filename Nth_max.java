package revature_programs;

import java.util.Scanner;

public class Nth_max {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);	
//		int n = scan.nextInt();
		int n = 3;
		int a[] = {1,1,2,3,4,4,5,6,6};
		findnthmax(a,n);
	}
	
// ------------------------------------------------------------------------------	
//	------------------------------Using StringBuilder----------------------------
// ------------------------------------------------------------------------------
	
//	public static void findnthmax(int[] a,int n) {
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0;i<a.length;i++) {
//			if (sb.toString().contains(String.valueOf(a[i]))) {
//				continue;
//			}
//			else {
//				sb.append(a[i]);
//				sb.append(" ");
//			}
//		}
//		String[] w= sb.toString().split("\\s");
//		int d[] = new int[w.length];
//		for (int i = 0;i<w.length;i++) {	    
//			d[i] = Integer.parseInt(w[i]);
//		}
//		
//		int t = 0;
//		for(int i = 0;i<d.length-1;i++) {
//			for(int j = 1;j<d.length-i-1;j++) {
//				if (d[j] < d[j+1]) {
//					t = d[j];
//					d[j]=d[j+1];
//					d[j+1] = t;
//					
//				}
//			}
//		}
//			    
//			System.out.print(d[n]);
//		}														
//	}


	public static void findnthmax(int[]a,int n) {
		
		int t = 0;
		int nmax = 0;
		for(int i = 0;i<a.length-1;i++) {
			for(int j = 1;j<a.length-i-1;j++) {
				if (a[j] < a[j+1]) {
					t = a[j];
					a[j]=a[j+1];
					a[j+1] = t;
					
				}
			}
		}
		int b = 0;

		for (int i = 1;i<a.length;i++) {
			
			if (a[i] != a[i-1]) {
				nmax++;
				if (nmax == n) {
				    b = a[i];
					break;
				}
			}
		
		}
		System.out.println(b);
	}
			
		
}


		
		

		
		
	
