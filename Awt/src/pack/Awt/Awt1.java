import java.awt.*;

class Awt1
{
    Frame f;
    Awt1(String s)
    {
      f=new Frame(s);
      f.setSize(400,400);
      f.setVisible(true); 
     }

   public static void main(String...s)
   {
    new Awt1("First frame");
   }
}

/*
class Awt1 extends Frame 
{
    Awt1(String s)
    { super(s);     
     setSize(400,400);
     setVisible(true); 
     }

   public static void main(String...s)
   {
    new Awt1("First frame");
   }
}*/
