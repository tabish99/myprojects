class Outer
{               //every class file code goes to saperate class file(2 class file will bcreated)
  int x=10;                  // compliler im;plicitly does it
  static int y=20;
   
private static class Inner //complr implicitly compile and give name as Outer$Inner.class 
  {                 // static nested (can be maded self exctbl) by putting psvm in it
                    // so tht psvm()can be run.cmpl run it explictly(java Outer$Inner )  
                    //that means we may have psvm() in Inner class also
   void show()   
   {
    //System.out .println(x);non static class can not be referenced from static
 
    System.out .println(y); //implicitly Outer.y
   }
    public static void main(String...s)
    {
      System.out.println("this is inner class");
    }
  }

  public static void main(String...s)
    {
         Inner i=new Inner();
            i.show();
            i.main();
			
		Outer o=new Outer();
             
        System.out.println(o.x);			 
     
    } 

}