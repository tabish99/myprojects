package org.tabish.bgc_inheritence;
class  A
{
   A()
   {//super();
  System.out.println("a");
   }
  
   A(int x)
   {super();
  System.out.println("a"+x);
   }
}
	class B extends A
	{             
           B()
            {  
           System.out.println("b");
            }                        
           B(int x)
    	   {//super(40);
     	   System.out.println("b "+x);
     	   }     		 
        }

	class C extends B
	{
 	  C()
  	   { this(23);
             //
   	   System.out.println("c");
   	   } 
                        
       	   C(int x)
  	   {
            //super(20); no super still b runs default super playS
	   System.out.println("c"+x);                
   	   } 	      

       	   public static void main(String...s)
	   {
	    new C();
            //a b c23 c	
	  // new C(10);
           
	   }
			
	}