
package org.tabish.gc;
class Temp3
{
   public static void main(String...s)
   {
          
     Runtime r=Runtime.getRuntime();   //mEMEORY IN BYTES
     System.out.println(r.totalMemory());
     System.out.println(r.freeMemory());
     show();

      //System.gc();
    
   }
  
    static void show()
       {  int i=0;
         Demo3 d1[]=new Demo3[20000]; 
         Demo3 d2[]=new Demo3[200000];
         Demo3 d3[]=new Demo3[20000];    

         for(i=0;i<20000;i++) 
         d1[i]=new Demo3();      
             for(i=0;i<200000;i++) 
             d2[i]=new Demo3();  
                 for(i=0;i<20000;i++)           
                 d2[i]=new Demo3();  
        display(); 
       }

      static void display()
       {  int i=0;
           Demo3 d[]=new Demo3[200000]; 
         for(i=0;i<200000;i++) 
          {
            d[i]=new Demo3();      
           
           }
       }
}

class Demo3 
{  static Demo3 d;
 public void finalize()throws Throwable
  {
     d=this;       //we can catch the reference id when jvm going to free it       
    System.out.println("jawan shaheed"+d); 
      d.s(); 
  }
 void s()
   { 
        System.out.println("ssssssssss"+ d);
   }
    

}

