package org.tabish.bgc_abstract;
abstract class Base
{
   //int x;
//   int y;
	void show()
	{
	  System.out.println("show from base");
	//  System.out.println(y);
	}
abstract void display();
}
/*         
abstract void set(int a,int b);
public static void main(String args[])
	 {
            Child c=new Child();
            c.pass(c);
             c.set(10,20);
            c.show();
            c.display();
	    
 	  Base b=new Child();
           b.set(10,20);
           b.show();
           b.display();           
          }
}
class Child extends Base
{
	void set(int x,int y)
	{
	 this.x=x;
	 this.y=y;
	}	
         void display()
         {
                    System.out.println("abstract display");
         }
        void pass(Child c1)        {	}            
}*/


class Child10 extends Base
{

void display(){System.out.println("dis from child");}

public static void main(String...d)
{
Base b=new Child10();
b.show();
}
}
