package com.widening_and_boxing;

public class MyByteWidening
	{
		public static void main(String... s)
			{
				byte b = 1;
				wideByte(b);
			}

		static void wideByte(short s)
			{
				System.out.println("byte short");
			}
		static void wideByte(int i)
			{
				System.out.println("byte integer");
			}
		static void wideByte(Byte b) // widening beat boxing
			{
				System.out.println("Byte Object integer");
			}
		static void wideByte(long i)
			{
				System.out.println("byte long");
			}
	}
