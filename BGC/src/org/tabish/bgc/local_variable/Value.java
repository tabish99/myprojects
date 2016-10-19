package org.tabish.bgc.local_variable;
class Value
{
 int y;
  

void show()
{
  int x;  //local variable must be initialized
  x=10;    //try to remove it and see magic
 System.out.println("lacal variable by default take "+x);
 System.out.println("class variable by default take "+y);

}


 public static void main(String...s)
	{
		Value v =new Value();
                 v.show();
	}
}