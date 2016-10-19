package org.tabish.bgc_static;

public class CallStaticBlock
	{

		public static void main()
			{
			   try
	            {
		            Class c=	Class.forName("org.tabish.bgc_static.Temp1");
		            Class.forName("org.tabish.bgc_static.Temp1");
		          
	            } catch (ClassNotFoundException e)
	            {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
	            }
			}
		
		
	}
		
