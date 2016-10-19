package org.tabish.generic;
class GenTypeDeom
{
  public static void main(String...s)
  {
     
    Genl2<Integer> iob=new Genl2<Integer>(90);
    GenStr<String> fob=new GenStr<String>("aaa"); 
    

   System.out.println(iob.getClass().getName());
   System.out.println(fob.getClass().getName());   
  }
}