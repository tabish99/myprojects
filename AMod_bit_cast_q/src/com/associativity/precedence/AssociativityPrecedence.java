package com.associativity.precedence;

public class AssociativityPrecedence {

	
	public static void main(String[] args) {
		
		int a=1; int b=1;  int r1,r2;
		
		/*
		 * a++ high precedence than ++b ,so a++ will be calculated first in r1 r2.
		 * But binary operator + would be evaluated from left to right , 
		 */
		
		a=1;b=1;
		System.out.println(a++ +" "+ ++b);   a=1;b=1;
		System.out.println(++b +" "+ a++);
		
		a=1;b=1;                 //a++(L to R) , ++a(R to L), assignment = (R to L)
		r1= a++ + ++b;           // r1 would be calculated in order a++,++b,+(low precedence)   
		a=1; b=1;               
		r2= ++a + b++;           // r2 would be calculated in order b++,++a,+(low precedence)
		a=1;b=1;
		System.out.println(r1 +" "+r2+" "+ a++ + ++b +" "+ ++b + a++); a=1;b=1;
		a=1;b=1;
		System.out.println(a+++ ++b);a=1;b=1;
		System.out.println(a++ + ++b);
		a=100;
		r2=20*a++/100/20*20/20*20;       //20*  L to R(*,/) same precedence a++ will be calculated first 
		System.out.println(r2);
		
		// r2=10+10+" "+10+10;    //ERROR can not convert from string to int
		  String s=10+10+" "+10+10;
		// String s=10+10;    //ERROR not allowed can not convert  int to String 
		System.out.println(10+10+" "+10+10);
		System.out.println(s);
		
		}

}
