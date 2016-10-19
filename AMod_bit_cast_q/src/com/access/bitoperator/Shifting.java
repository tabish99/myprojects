package com.access.bitoperator;

public class Shifting
	{

		public static void main(String[] args)
			{
				leftShift(8);
				rightShift(10);
				leftShift(-8);
				rightShift(-10);

			}
	static void leftShift(int element)
		{
			System.out.println("previous : "+element);
		int afterElement =element <<1;
		System.out.println("after leftShift  : "+afterElement);
		System.out.println("previous : "+element);
		 afterElement =element <<2;
		System.out.println("after 2 leftShift  : "+afterElement);
		}
	 static void rightShift(int element)
			{
				System.out.println("previous : "+element);
			int afterElement =element >>1;
			System.out.println("after rightShift  : "+afterElement);
			System.out.println("previous : "+element);
			afterElement =element >>>1;
		    System.out.println("after >>> rightShift  : "+afterElement);
			
			}
	}
