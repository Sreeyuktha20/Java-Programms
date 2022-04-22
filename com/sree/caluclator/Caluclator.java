package com.sree.caluclator;

public class Caluclator {

	public static void main(String[] args) {
		int a=  2;
		int b = 3;
		System.out.println(add(a,b)+" "+sub(a,b)+" "+mul(a,b) +" "+div(a,b));
		
	}
	
		public static int add( int m,int n)
		{
			return m+n;
		}
		public static int sub(int m,int n)
		{
			return m-n;
		}
		public static int mul(int m,int n)
		{
			return m*n;
		}
		public static int div(int m ,int n)
		{
			return m/n;
		}
		
}
