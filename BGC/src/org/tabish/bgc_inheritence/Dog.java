package org.tabish.bgc_inheritence;

public class Dog extends Animal
	{

		/**
		 * @param args
		 */
		int x=40;
		public void show()
			{
				
				System.out.println("Dog");
			}
		
		public static void doStuff()
		{
			System.out.println("dog");
		}
		
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				
				Animal a[]={new Animal(),new Dog()};
				for(Animal aa:a)
					{
					    aa.doStuff();	
					}	
					new Dog().h();
			}

		public void h()
			{
				
				System.out.println(this.x);
				System.out.println(((Animal)this).x);
				System.out.println(((AnimalKaBaap)this).x);
				
			    this.show();
				((Animal)this).show();
				((AnimalKaBaap)this).show();
				
				super.show();
			}
		
	}
