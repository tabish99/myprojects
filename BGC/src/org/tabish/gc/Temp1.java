
package org.tabish.gc;
class Temp1
{
   public static void main(String...s)
   {
    
    Runtime r=Runtime.getRuntime();   //mEMEORY IN BYTES
    System.out.println(r.totalMemory());
   System.out.println(r.freeMemory());
    show();
      for(int i=0;i<10;i++)
       { 
              System.gc();
           System.out.println(i);   
       }  
   }

   static void show()
    {
     Demo1 d1=new Demo1(); 
       display(); 
    }

   static void display()
   {
    Demo1 d2=new Demo1(); 
     
    }
}

class Demo1 
{
 public void finalize()throws Throwable
  {
    System.out.println("jawan shaheed"); 
  }

}

