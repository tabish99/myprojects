package com.widening_and_boxing;

public class Boxing
	{
		public static void main(String... s)
			{
				
				byte b = 1;
				boxByte(b);
			}

		static void boxByte(Byte s)
			{
				System.out.println("box byte TO Byte(Wrapper)");
				System.out.println(" \n1  byte(primitive) can not become Short(wrapper)");
				System.out.println("2   u can not WIDE THEN BOX " );
				System.out.println("3   it is not legel to wide from one wrapper to another wrapper class ");
				
				// REMOVE THIS METHOD U WILL GET ERROR   BCOZ OF 1,2,3
				// u can box and wide through object class or inheritance see BoxWide class
			}
		static void boxByte(Short s)
			{
				System.out.println("byte(primitive) can not become Short(wrapper)");
			}
		static void boxByte(Integer i)
			{
				System.out.println("it is not legel to wide from one wrapper to another wrapper class ");
			}
		static void boxByte(Long i)
			{
				System.out.println("u can not WIDE THEN BOX but box and wide is possible only via Object that is inheritence" );
			}
	}
