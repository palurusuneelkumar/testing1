package com.nt;

public class AddtiontwoNumbers {
	public static void main(String[] args) {
		

	int[] a={1,2,3,5,8,9};
	int[] high=new int[a.length-1];
	for(int i=0;i<a.length-1;i++)
	{
		int b	=a[i]+a[i+1];
		high[i]=b;
	}
	System.out.println("\nhighesst:    "+high[high.length-1]);
}
}
