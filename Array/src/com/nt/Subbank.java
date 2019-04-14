package com.nt;

interface Bank{
	public int withdraw(int a,int b);
	
}
interface Bank1{
public void deposit();
}
/*class Sbi implements Bank{

	@Override
	public void withdraw(int amt) {
		System.out.println("withdraw Amount:"+amt);
		
		}}*/
public class Subbank {

	public static void main(String[] args) {
Bank s=(int a,int b)->20*30;

		System.out.println("withdraw Amount:"+s );
	}		
}
