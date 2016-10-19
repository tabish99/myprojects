package com.integer.cache;

public class MyIntegerCache
	{
		public static void main(String[] args)
			{
				
				Integer i1=4;    //storing into cache(to save meemory)
				Integer i2=4;
				System.out.println(i1);
				if(i1==i2)          //         Boolean,Byte,Character, Short and Integer upto value 128
					System.out.println("true");
				
				System.out.println("***********equal**up*&**down*******************");
				Integer i11=new Integer(4);
				Integer i22=new Integer(4);     // new object
				System.out.println(i11);
				if(i11==i22)
					System.out.println("true");
				

			}

	}
