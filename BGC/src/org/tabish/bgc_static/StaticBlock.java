package org.tabish.bgc_static;
 class StaticBlock
	{

		public static void main(String... s)
			{
				Temp1.d.show(12);
				Temp1.d.show(12);
				//see call static block
				CallStaticBlock.main();
			}
	}
		 class Temp1
			{
				static Demo1 d;
				  
				static
					{
						d = new Demo1();
						System.out.println("class load only one time");
					}
			}

		  class Demo1
			{
				int x=0;
				public void show(int x)
					{
						System.out.println("in show");
						System.out.println(x);
					}
			}
