package org.tabish.bgc_static;
class StaticBlock2
{
 int x=10;
 int y=20;

     void show()
	{
	System.out.println(x);
	System.out.println(y);
	}
 


   static
   { 
	StaticBlock2 sb2=new StaticBlock2();
	sb2.show();
   }
}
