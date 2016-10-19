package org.tabish.bgc_constructor;
class Temp
{
  int y;   
  int x;
  
   void show()
   {
      System.out.println(x);
     System.out.println(y);
   }
  
 Temp(int x,int y)
  {  this(45);
     
      System.out.println(x);
      System.out.println(y);

	{
	System.out.println("lllllllx");
	}
  }

     Temp(int x)
    {     
       System.out.println(x);  
    }
  
        public static void main(String...s)
        {
       new Temp(10,20);
        }
}