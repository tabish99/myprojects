interface My    //it is not class
{
  void show();   //implicitly public and abstract,public bcos itis used by outer class ,trfr must be public
}

interface My1
{
void display();
void show();
}


 class Child implements My,My1     //not extend(search)fncnlty increase   
{

  public void show()//(chld cls has to implmnt all the mthd of intrfc).not overide overide is dn only wth mem fn.of class
  {
    System.out.println("show");
  }
   public void display()   //explctly public bcoz we r usng(implmenting) methd out side of interface trfr must be public
   {
   System.out.println("display");
    }
    
     public static void main(String...s)
      {
        My m=new Child();        //we can put the reference id of child to its parents.
         m.show();
        My1 m1=new Child();
       m1.display();       
       m1.show(); 

       /* Child c=new Child();
         c.show();
        Child c1=new Child();
       c1.display();       
       c.show();  
        */
       }
}  

