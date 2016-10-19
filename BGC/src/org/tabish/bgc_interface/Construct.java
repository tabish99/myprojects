package org.tabish.bgc_interface;
interface M
{
  /* M()
    {
     System.out.println("HEloo constructor");
    }*/
    void show();

}


class Construct implements M 
{

  public void show()
  {
  System.out.println("Show");
  }

   
   public static void main(String...s)
   {
     M m=new Construct();     
      m.show();

   }
}
