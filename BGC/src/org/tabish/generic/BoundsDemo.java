package org.tabish.generic;

public class BoundsDemo
{
 
  public static void main(String...s)
  { 
 Integer inums[]={1,2,3,4,5};
  Stats<Integer> iob=new Stats<Integer>(inums);  
  double v=iob.average();
  System.out.println("iob average is"+v);

   Double dnums[]={1.1,2.2,3.3,4.4};
   Stats<Double> dob=new Stats<Double>(dnums);
    double w=dob.average();
    System.out.println("dob average is"+w);
   
 //  String inums[]={"aa"};
   //Stats<String>=new Stats<String>(inums);
   
   }   

}