package com.modifiers2;

import com.modifiers1.Parent;

public class Child extends Parent
	{

		/**
		 * @param args
		 */
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				new Child().func();
			}
		public void func()
			{
				System.out.println(callProtectedParent());
			}

	}
