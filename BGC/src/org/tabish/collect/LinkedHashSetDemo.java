package org.tabish.collect;


import java.util.*;
class LinkedHashSetDemo
{
  public static void main(String...s)
  {
   LinkedHashSet<String> al=new LinkedHashSet<String>();
   System.out.println(al.size());
   al.add("a");
   al.add("b");
   al.add("c");
   System.out.println(al.add("c"));
   System.out.println(al.size());
   System.out.println(al);
  }
}