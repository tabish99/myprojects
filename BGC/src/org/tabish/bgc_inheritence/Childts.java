package org.tabish.bgc_inheritence;


class Childts implements My
{
   public void show()
    {
      System.out.println("show");
    }
   
  /* public String toString()
    {   
      System.out.println(getClass().getName());   // only printing class names
       return "hello";          // no return("hello");bcz  java.lang.Object can not be applied to java.lang.String 
    }*/

   public static void main(String...s)
   {
      My m=new Childts();
        m.show();
        System.out.println(m.toString());   //every interface has got non static
                                                 // function by default ::javap Child1 see extends
   }
}
  