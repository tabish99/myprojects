package org.tabish.collect;


import java.util.*;
class MyComp implements Comparator
{
  public int compare(Object o1,Object o2)
   {
     Temp t1=(Temp)o1;  
     Temp t2=(Temp)o2;

    if(t1.salary>t2.salary)
         return 1;
      else if(t1.salary<t2.salary)
           return -1;
       else
          return 0;   
   }

}