package chakeStringAreAnargamOrnot;

import java.util.Arrays;

public class susobhan {
	public static void main(String args[]) {
		String s1 ="susbhoan";
		String s2="susobhna";
		int n1= s1.length();
		int n2= s2.length();
		int arr1[]= new int[n1];
		int arr2[]= new int [n2];
		
		int k=0;
		int m=0;
		
		for(int i=0;i<n1;i++) {
			arr1[k]=s1.charAt(i);
			k++;
		}
		for(int i=0;i<n2;i++) {
			arr2[m]=s2.charAt(i);
			m++;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(n1!=n2) {
			System.out.print("not same");
			return;
		}
		
		
		int same=0;
		for(int i =0;i<n1;i++) {
			if(arr1[i]!=arr2[i]) {
				same=1;
			}
			
		}
		
		
		
		if(same==0) {
			System.out.print("strings are matching");
		}
		else {
			System.out.print("strings are not matching");
		}
		
		
		
	

}
}
