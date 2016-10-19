package com.widening_and_boxing;
public class WideBoxVarArgs
	{		public static void main(String[] args)
			{
				byte b=1;  wideBox(b);  	wideVarArgs(b,b);     boxVarArgs(b,b);
			}
		public static void wideBox(long l)
				{	System.out.println("widening beat boxing");				}
		
		public static void wideBox(Byte b)
			{System.out.println(b);}
	
		
		public static void wideVarArgs(long l,int s)
			{   System.out.println("widening beat varArgs");			}
		
	public static void wideVarArgs(byte ...s)
		{System.out.println(s);		}
	
	public static void boxVarArgs(Byte b1,Byte b2)
		{  System.out.println("boxing beat varargs");       	}
	
public static void boxVarArgs(byte ...s)
	{ System.out.println(s);	}
	}
