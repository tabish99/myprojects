package org.tabish.generic;
class GenArrays
{
 public static void main(String...s)
 {
  Integer n[]={1,2,3,4,5};
  GenArray<Integer> gen=new GenArray<Integer>(50,n);
   
   //GenArray<Integer> gen[]=new GenArray<Integer>[10];  
          //all integer
   //wrong
    GenArray<?> gens1[];  
   GenArray<?> gens[]=new GenArray<?>[10];
   
    gens[0]=new GenArray<Integer>(10,n); 
     gens[1]=new GenArray<Float>(2.3f,new Float[]{1.2f});

    for(int i=0;i<gens[0].vals.length;i++)
    System.out.println(gens[0].vals[i]);

    for(int i=0;i<gens[1].vals.length;i++)
    System.out.println(gens[1].vals[i]);

 }
}