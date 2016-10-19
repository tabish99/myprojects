package org.tabish.excep;

class Temp7
{
     //unchecked exception are automatically forwarded to callingchain we cant do it             
	//in checked bcos catched must be provided in prlllel othrwis error(refer to checked)   
                //without handler checked does not run            
                    //in checked exception catch block are needed in parallel
     //exception came here but catched in main 
		 void show() 
  		{
                   int x=10/0;                 
                }
   void display()
    {
     show();
    }  

  public static void main(String...s)
  {
    Temp7 t=new Temp7();
    try
     {
      t.display();
     }
     catch(ArithmeticException e) 
     { 
       System.out.println("hello"+e);
       e.printStackTrace();            //print the stack from which exception has came
     }
   }

}
