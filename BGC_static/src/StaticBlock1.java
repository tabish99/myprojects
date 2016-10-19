class StaticBlock1
{

public static void main(String...s)
{
Temp.d.show();
}

}

class Temp
{
  static Demo d;
   static
   { try
      {
  	int z=System.in.read();
          d=new Demo(z);       
      }catch(Exception e)
	{
 	 
 	}
   }
}
class Demo
{ int x;
public void show()
{
System.out.println(x);
}

Demo(int x)
{
this.x=x;
} 
}