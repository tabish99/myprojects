interface My
{
  void show(); 
}



interface My1
{
void display();  //by defautl public $ abstract
void show();

}

class Child implements My,My1
{

  public void show()    //must be public (weaker to stronger allowed)
  {
    System.out.println("show");
  }
   public void display()
   {
   System.out.println("display");
    }
    
     public static void main(String...s)
      {
        My m=new Child();
         m.show();
        My1 m1=new Child();
       m1.display();       

       }

}