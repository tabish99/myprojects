package org.tabish.bgc_inheritence;
/*interface My
 {
 void show();   //implicitly public and abstract,public bcos itis used by outer class ,trfr must be public
 }*/

class Child12 implements My3
	{
		public void show() // bcz we r using outside of interface
			{
				System.out.println("show");
			}
		public void display()
			{
				System.out.println("display");
			}
		public void fmy()
			{
				System.out.println("func my");
			}

		public static void main(String... s)
			{
				My3 m = new Child12();
				m.fmy();
				m.display(); // child my parent my1 my2
				m.show();
				/*
				 * My1 m1=new Child(); m1.show(); m1.display(); My2 m2=new
				 * Child(); m2.display(); m2.show();
				 */
			}
	}
