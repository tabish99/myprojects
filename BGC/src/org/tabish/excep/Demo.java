package org.tabish.excep;

import java.io.IOException;
class Te
{

  int divide(int x,int y) throws ArithmeticException  //suppose divide fn given by devloper
   {                 				     //with throws keyword
    return x/y;             //we use divide fn in our prgrm so we must put handler
   }
  
  void display() throws IOException //{in this case} checked exception is forwarded calling chain
   {
     divide(10,0);
   }
}
class Demo
{
public static void main(String...s)//never put thrws after psvm bcos excpn reach to jvm(terminate)
   {
       try
         { 
           Te t=new Te();
           t.display(); 
          }    
          catch(Exception e)         
         {
           System.out.println("hhhh"+e);  // via toString
         }
  }
}
/*
3 adv
1.throws indicate the programmer to put handler
2.developer is avoiding to the handler
3.checked Exception is forwarded to calling chain {unchecked automatically does this thing frsrded to chain}
*/