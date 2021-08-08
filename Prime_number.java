// Print the prime numbers in an array


package revature_programs;

public class Prime_number {

	public static void main(String[] args) {
		
		int[] a = {1,2,11,3,4,5,6,7,8,9};
		StringBuilder sb = new StringBuilder();
		for (int i = 0;i<a.length;i++) {
			if(a[i]!=1) {
				if(!isPrime(a[i])) {
				     sb.append(a[i]);
				     sb.append(" ");
				}
				
			}
		}
		
		String s[] = sb.toString().split(" ");
		int [] b = new int[s.length];
		for(int i = 0;i<s.length;i++) {
			b[i] = Integer.parseInt(s[i]);
			System.out.print(b[i]+ " ");
		}
	}
	
	public static Boolean isPrime(int n) {
		Boolean res = false;
		for(int i = 2;i<n/2+1;i++) {
			if (n%i==0) {
				res = true;;
			}
		}
	
			
		return res;
		
	}
	

}
