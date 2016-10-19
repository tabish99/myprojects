import java.awt.*;

class Awt3 extends Frame
{ Frame f;
  Button b;
  TextField tf;
   Label l;  
  Awt3(String s)
  { super(s);
  // f=new Frame(s);      //if extends frame then super(s).check

     b=new Button("ok");        
     b.setBounds(40,110,30,30);
     add(b);
            tf=new TextField();
            tf.setBounds(100,50,60,30);
            add(tf);
                      l=new Label("Enter your name");        
    		      l.setBounds(0,50,140,30);
     		      add(l);  //f.add(l);
 
    setLayout(null);   //f.setLayout(null);
   setSize(500,500);
   setVisible(true); 
  }
  
   public static void main(String...s)
   {
   new Awt3("MY THIRD FRAME");
   }
 
} 