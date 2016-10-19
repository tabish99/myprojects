class Outer2
{
    int x=10;
   static int y=20;

   class Inner2  //note:nonstatic
   {
      void show()
      {
       System.out.println(x);
        System.out.println(y);   
      }
   }
  
public static void main(String...s) 
{
   Outer2 o=new Outer2();   
   System.out.println(o.x);          //10
    Outer2.Inner2 i=o.new Inner2(); 
    
    i.show();                        //#how 10 we r mkng object of inner2    Sop(Outer.this.x)
                                     //20
}   
}
/* from # non static class can access all the member of outer class
   non static nested class can not have its personal  static data memeber and static mem fn
  i.e inner can  not b made self executable bcos main(static) can not come here
*/