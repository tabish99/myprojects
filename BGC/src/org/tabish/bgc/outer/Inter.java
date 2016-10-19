package org.tabish.bgc.outer;
class Inter implements My1
{
  public static void main(String...s)
  {
    
   z.show();   
   Inner i=new Inner();
   i.display();
  }
}

interface My1         //My1$1.class is also there i.e anonymous
{
  My z= new My()    //anonymous class
              {
                public void show()
                {
                  System.out.println("anonymous");
                }
              };

   class Inner
    {
      void display()
       {
         System.out.println("static nested class in interface ");
       }      
    }
}