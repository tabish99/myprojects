package org.tabish.bgc_constructor;
class A 
{
   A()
   {
    System.out.println("A");
   } 

}

class B extends A
{
   B()
   {
    System.out.println("B");
    }

}

class C1 extends B
{
  C1()
  {
   System.out.println("C"); 
  }

 C1(int x)
  {
   System.out.println(x);
  }
    
   public static void main(String ...s)
   {
       new C1();
       // new C1(10);
       // o/p ABC
   }

}
