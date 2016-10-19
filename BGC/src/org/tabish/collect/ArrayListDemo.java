package org.tabish.collect;

import java.util.*;

class ArrayListDemo
{
   public static void main(String...s)
    {        //<String>
      ArrayList<String> al=new ArrayList<String>();
      ArrayList<String> al1=new ArrayList<String>();
        System.out.println(al.size());        
       al.add("d");  al1.add("d");
       al.add("b");  al1.add("b");
       al.add(null);  al1.add(null);
       al.add("b");  al1.add("b");
      //al.add(new Integer(10));  
    
  
   System.out.println(al.size());
   al.remove(2);  al1.remove(2);
   
   System.out.println(al.size());
   System.out.println(al);   //toString override
   System.out.println(al1);
   
   System.out.println(" equals :"+al.equals(al1));
   
   
   ArrayList<ArrayList> al11=new ArrayList<ArrayList>();
   ArrayList<ArrayList> al22=new ArrayList<ArrayList>();
   al11.add(null);al22.add(null);
   al11.add(new ArrayList<>());al22.add(new ArrayList<>());
   ArrayList<String> z11=new ArrayList<String>();
   ArrayList<String> z22=new ArrayList<String>();
   z11.add("a"); z22.add("a");
  // al11.add(z11);al11.add(z22);
   System.out.println("equals inside list : "+al11.equals(al22));
    }
}