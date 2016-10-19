package org.tabish.generic;
class TwoGen<T1,T2>
{
  T1 t1;
  T2 t2;

 TwoGen(T1 t10,T2 t20)
 {
   t1=t10;
   t2=t20; 
 }

  void showTypes()
  {
   System.out.println("Type of T1 is:"+t1.getClass().getName());
   System.out.println("Type of T2 is:"+t2.getClass().getName());
  }
 
  T1 getOb1()
   {
    return t1;
   }

   T2 getOb2()
   {
    return t2;
   }
}