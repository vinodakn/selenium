package testcase;

public class testpresent {
	
	public static void main(String[] args) {
		int a[]= {10,5,8,12,0,9};
		for (int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if (a[i]> a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
