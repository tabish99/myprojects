/*interface My
{
  void show();   //implicitly public and abstract,public bcos itis used by outer class ,trfr must be public
}*/
interface My1
{
void display();       //by default public and abstract
void show();
}
interface My2
{
void display();
void show();
}

interface My extends My2,My1 
{                   //multiple inheritance is not allowed in cse of classes
    void fmy();    //one intrfce can extends more tha 1 intrfce injava(multiple inheritance in cse of intrfce)
}    
  
class Child12 implements My
{
   public void show()      //bcz we r using outside of interface 
  {
   System.out.println("show");
  }
   public void display()
   {
    System.out.println("display");
   } 
   public void fmy()
   {
   System.out.println("func my");
    }
    
     public static void main(String...s)
      {
         My m=new Child12();
         m.fmy();
         m.display();    //  child my parent my1 my2
         m.show();  
    /*  My1 m1=new Child();
      m1.show();
      m1.display();   
          My2 m2=new Child();
        m2.display();       
        m2.show();*/
       }
} 