import java.awt.*;

class Awt2
{ Frame f;
  Button b;
  TextField tf;  
  Awt2(String s)
  {
   f=new Frame(s);

     b=new Button("ok");        
     b.setBounds(40,110,30,30);
     f.add(b);
            tf=new TextField();
            tf.setBounds(40,50,60,30);
            f.add(tf);
    f.setLayout(null);
   f.setSize(500,500);
   f.setVisible(true); 
  }
  
   public static void main(String...s)
   {
   new Awt2("MY SECOND FRAME");
   }

 
} 