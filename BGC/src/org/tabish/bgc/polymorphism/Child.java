package org.tabish.bgc.polymorphism;

public class Child extends Parent
	{

		public void show() throws Exception
			{// OVER RIDING method can throw any unchecked exception
			    /*OVER RIDING method must not throw any new or broader checked exception
				than those declare by parent method*/
				
				// if parent throwing Exception and child does not (compilation error)
				
				System.out.println("child");
				
			}

		void my()
			{
				System.out.println("my c");
			}

		public static void stat() // static method hiding
			{
				System.out.println("stat c");
			}

		public static void main(String[] args)
			{
				Parent p = new Child();
				try
	                {
		                p.show();
	                } catch (Exception e)
	                {
		                // TODO Auto-generated catch block
		                e.printStackTrace();
	                }
				// p.my();
				p.stat();
			}

	}
