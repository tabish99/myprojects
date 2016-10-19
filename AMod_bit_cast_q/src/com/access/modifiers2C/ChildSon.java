package com.access.modifiers2C;

public class ChildSon extends Child
	{
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				new ChildSon().func1();
			}
		public void func1()
			{
				System.out.println(callProtectedParent());
				System.out.println(protect);
				System.out.println("ok"+super.protect);
				
				//System.out.println(pdefaultVar);
			}

	}
