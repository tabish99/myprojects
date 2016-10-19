package org.tabish.gc;

class Temp
{
   public static void main(String...s)
   {
   
   show();
   System.gc();
   }

   static void show()
    {
     Demo d1=new Demo(); 
       display(); 
    }

   static void display()
   {
    Demo d2=new Demo(); 
       
    }
}

class Demo 
{
 public void finalize()throws Throwable
  {
    System.out.println("jawan shaheed"); 
  }

}

