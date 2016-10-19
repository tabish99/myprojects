package org.tabish.generic;
class HierDemo2
{
  public static void main(String...s)
  {
   Genl<String> w=new Genl<String>("hello",47);
   System.out.println(w.getOb()+ " ");    
   System.out.println(w.getNum()+ " "); 

  } 
}