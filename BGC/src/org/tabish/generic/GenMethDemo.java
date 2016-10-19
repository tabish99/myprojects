package org.tabish.generic;
class GenMethDemo
{

  static <T, V extends T> boolean isLn(T x,V []y)
  {
  for(int i=0;i<y.length;i++)
     if(x.equals(y[i]))
        return true;
          return false;  
  }
 
  static <T extends Number> double add(T x,T y)
  {
  double d=x.doubleValue()+y.doubleValue();
  return d;
  }

 public static void main(String...s)
  {
     Integer nums[]={1,2,3,4,5};
     if(!isLn(7,nums))
       System.out.println("7 is not nums");
        System.out.println();
    

     String str[]={"one","two","three","four","five"};
     if(isLn("two",str))
       System.out.println("two is in strs");
        System.out.println();

     if(!isLn("seven",str))
       System.out.println("seven is not in strs");
        System.out.println();
  
      System.out.println(add(10,20));
      System.out.println(add(10.f,20.5f));
  }

}