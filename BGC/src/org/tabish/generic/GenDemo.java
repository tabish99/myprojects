package org.tabish.generic;
public class GenDemo
{
public static void main(String...s)
 {
  Gen<Integer> iob=new Gen<Integer>(88); 
  iob.showType();
  int v=iob.getOb();
  System.out.println("values"+v); 
  

  Gen<String> str=new Gen<String>("generics tsxt"); 
  str.showType();
  String u=str.getOb();
  System.out.println("values"+u);
 }
}