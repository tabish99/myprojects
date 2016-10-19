package org.tabish.generic;
public class SimpGen
{
  public static void main(String...s)
  {
    TwoGen<String,Integer> tgobj =new TwoGen<String,Integer>("two generic value",900);
    
   tgobj.showTypes();
   String s1=tgobj.getOb1();
   System.out.println("value 1st"+s1); 



   int s2=tgobj.getOb2();
   System.out.println("value 1st"+s2); 
 }
}