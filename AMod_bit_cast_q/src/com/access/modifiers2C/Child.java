package com.access.modifiers2C;

import com.access.modifiers1P.Parent;

public class Child extends Parent
	{
		int k;
		/**
		 * @param args
		 */
		public static void main(String[] args)
			{
				
				// TODO Auto-generated method stub
				new Child().func();
			}
		 void func()
				System.out.println(k);
				System.out.println(callProtectedParent());
				System.out.println(protect);
				System.out.println(super.protect);
				
				//System.out.println(pdefaultVar);
			}

	}
