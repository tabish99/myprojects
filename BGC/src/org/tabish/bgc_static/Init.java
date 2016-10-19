package org.tabish.bgc_static;
class Init
{

   {
      System.out.println("hi");
    }


   Init()
   {
     System.out.println("init()");
   }

    Init(int z)
   {
     System.out.println("init()"+z);
   }

    {
      System.out.println("hi+noi");
    }

 public static void main(String...s)
 {
   new Init();
 new Init(10);
 }


}