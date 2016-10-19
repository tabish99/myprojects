class StaticBlock
{

public static void main(String...s)
{
Temp.d.show(12);
}

}

class Temp
{
  static Demo d;
   static
   { 
   d=new Demo();
   }
}

 class Demo
 {
 public void show(int x)
 {
 System.out.println(x);
 }
 }