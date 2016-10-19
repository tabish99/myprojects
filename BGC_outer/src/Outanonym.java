class Outanonym
{
  int x=10;
  static int y=20;

 My display()                //see  Outanonym$1.class it is anonymous class
 {                           //we can create anonymous class by 3 method see notes 
    return (new My()
             {  public void show()
              {
                System.out.println(x);
                System.out.println(y);            
              }
             }
           );
 }

   public static void main(String...s)
   {
     Outanonym o=new Outanonym();     
     My z=o.display(); 
     z.show();
   }
}                      

interface My
{
void show();
}