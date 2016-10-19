package org.tabish.collect;


import java.util.*;
class ArrayListGenericDemo
{

  public static void main(String...s)
  {
    ArrayList<String> data=new ArrayList<String>();
     
       data.add("ssss");
       data.add(null);
       data.add("goodbye");
       data.add(null);
       //data.add(new Date());
        
       
   
      Iterator<String> it=data.iterator();
         while(it.hasNext())
         {
            String z=it.next();
            System.out.println(z);         
         }
      
   }
}