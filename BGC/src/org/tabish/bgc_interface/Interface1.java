package org.tabish.bgc_interface;
interface My11
{
  void show(); 
}
interface My111
{
void display();  //by defautl public $ abstract
void show();
}

interface My1111 extends My11,My111
{

   void hook();
  
}
		
class Child11 implements My1111
{	
    public void show()    //must be public (weaker to stronger allowed)
    {
     System.out.println("show");
    }
    public void display()
    {
     System.out.println("display");
    }
	 public void hook()
     {
     System.out.println("hook");
    }
     public static void main(String...s)
      {
        My11 m=new Child11();
             m.show();
        My111 m1=new Child11();
              m1.display();  
			  m1.show();
        My1111 m11=new Child11();	   
               m11.hook();
			   m11.display();  
			   m11.show();
       }

}