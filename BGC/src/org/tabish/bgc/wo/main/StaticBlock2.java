package org.tabish.bgc.wo.main;

class StaticBlock2
{
 int x=10;
 int y=20;
static int z=10;
     void show()
	{
	System.out.println(x);
	System.out.println(y);
	}
 

/**
 * Only possible upto JDK 1.6
 */
   static
   { 
	System.out.println("java program without main");
   }
   
	   
   }
   
   

