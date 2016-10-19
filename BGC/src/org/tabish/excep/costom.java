package org.tabish.excep;

class MyException extends Exception //our own Exception class
{                              //debug is easy
  MyException(String s)
   { 
    super(s);     //evry exception class has got one constructor(string argument)     
                  //and constrtr by using getMessage returns the string using toString().
    
    System.out.println("via tostring :"+toString());
    System.out.println("via getlocalised :"+getLocalizedMessage()); 
    System.out.println("via getmessage :"+getMessage());
    System.out.println("via throwable cause :"+initCause(getCause()));
   }               
}
 
class Costom
{
 int age;

  void get(int age)throws MyException
   {
   	if(age<18)
     	 {
	 throw new MyException("invalid age"); 
	 }	
         else
	{
	 this.age=age;
  	}
   } 

   public static void main(String...s)
   {
     Costom c=new Costom();
      System.out.println("not in case of exception why "+c);
     try
     {
      c.get(10);
     }
     catch(MyException e)
     {
            
      System.out.println("in case of exception why"+e);//it prints appropriate message not(3 item classname@hashcode why)
     }
   }

}
