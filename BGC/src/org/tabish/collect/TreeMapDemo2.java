package org.tabish.collect;



import java.util.*;
class TreeMapDemo2   //in insertion order
{
 public static void main(String...s1)
  { 
    HashMap<String,String> hm=new HashMap<String,String>();//random
   System.out.println(hm.size());
    System.out.println("random");
    hm.put("1004","ddd");
    hm.put("1003","ccc");
    hm.put("1002","bbb");
    hm.put("1001","aaa");
   
     Set s=hm.entrySet();
     Iterator i=s.iterator(); 
      while(i.hasNext())
      { Map.Entry e=(Map.Entry)i.next(); 
       String k=(String)e.getKey();
       String v=(String)e.getValue();
      System.out.println(k+"="+v);
      }
  }

}