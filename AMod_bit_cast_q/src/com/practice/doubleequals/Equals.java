package com.practice.doubleequals;

public class Equals
	{
		public static void main(String[] args)
			{
				int a=5;
				int b=5;
				int c =0;
				Boolean boo= new Boolean("1");
				System.out.println(boo);
				byte byt=1;
				if(byt!=1)
					{
						System.out.println();
					}
				/*if(a==b)
					System.out.println("==");
				
				if(a=b) //Type mismatch: cannot convert from int to boolean
					System.out.println("=");
				
				if(a===b) //Syntax error on token "=", delete this token
					System.out.println("=");
				
				
				in javascript triple equals return false if type is different
				 whereas == perform type conversion string obj 0 and int 0*/
			 
				Short s=new Short((short)2);
				Integer i=new Integer(2);
				if(s==i) //Incompatible operand types Integer and Short
					{
					}
				Short s1=2;
				Integer i1=3;
				if(i1==s1)
					{
					}
				
				
				if(0.1*3==0.3)
					{
					  System.out.println("true");       //why this is not true	
					}
				else{
					System.out.println("not true");
				     }
			int y=3;
			double z=1.1;
			double x=3.3;
			z=z*y;
		    System.out.println(z +" -- "+ x);
				if(x==z)
					{
					  System.out.println("true");       //why this is not true	
					}
				else{
					System.out.println("not true");
				     }
			}
		

	}
