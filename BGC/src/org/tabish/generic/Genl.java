package org.tabish.generic;
class Genl<T> extends NonGen
{
T ob;
  Genl(T o,int i)
   {
     super(i);
     ob=o;
   }

  T getOb()
    {  
      return ob;
    }
}