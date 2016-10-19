package com.implicit.casting;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       fun(new int[]{1,2,3});
       fun(new Integer[]{1,2,3});
       cast();
	}
	
	public static void fun(Object o){
	System.out.println(o);
	byte b=7;   //compiler implicitly casting integer into byte 
	b+=1;      //integer but,implicit casting into byte
	//b=b+1;  //  casting is mandatory in downcasting int to byte
	System.out.println(b);
	}
	
	public static void cast()
	{ float f=110.01f;
		int i=(int)f;  // casting is mandatory in downcasting
		float ff=i;
		System.out.println(i);
		System.out.println(ff);
	}
}
