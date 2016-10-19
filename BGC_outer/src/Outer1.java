class Outer1 extends Outer
{

  public static void main(String...s)
   {
     System.out.println(Outer.y);  //both(outer and inner) are accessible out side of class
   // Outer.Inner oi =new Outer.Inner();  
    //oi.show();
                                   //make nested class as private now its give error
   }
                                                  
                                      
}
/*  if we extends Outer only Outer is accessible 

try to see data member and data method
javap Outer1
javap Outer
javap Outer$inner
 

*/