import java.awt.*;
import java.awt.event.*;
class Calc implements ActionListener
{  int i=0,k=0,l=0;
   int j=0;
    Frame f;
    Button b[];
    String a[];
    TextField tf;
    int ans;
    String q;
   
    Calc(String s)       
    { 
       a=new String[3]; 
      f=new Frame(s);
      b=new Button[17];  
      String s1[]={"1","2","3","C","4","5","6","CE","7","8","9","+","0","/","*","-","="};         
         tf=new TextField();        
         tf.setBounds(10,35,230,60);
         f.add(tf);
        for(i=0;i<b.length;i++)
        {  
            b[i]=new Button(s1[i]); 
            b[i].setBounds(10+k,100+l,50,50);
            k=k+60;
                 if(s1[i]=="C"||s1[i]=="CE"||s1[i]=="+"||s1[i]=="-")
                  { k=0;l=l+60;}               
           b[i].addActionListener(this);         
           f.add(b[i]);
        } 
        			
      f.setLayout(null);
      f.setSize(260,400);
      f.setVisible(true);
     // f.setBackground(Color.RED); 
     }
public void actionPerformed(ActionEvent e)
{  
 
 if(e.getSource()==b[0])
     tf.setText("1");
    
 if(e.getSource()==b[1])
     tf.setText("2");

if(e.getSource()==b[2])
     tf.setText("3");


if(e.getSource()==b[4])
     tf.setText("4");


if(e.getSource()==b[5])
     tf.setText("5");

if(e.getSource()==b[6])
     tf.setText("6");

if(e.getSource()==b[8])
     tf.setText("7");

if(e.getSource()==b[9])
     tf.setText("8");


if(e.getSource()==b[10])
     tf.setText("9");

if(e.getSource()==b[12])
     tf.setText("0");

	
 if(e.getSource()==b[11])   //+
   { i=0;
       a[i++]=tf.getText();
       a[i++]="+";
        tf.setText(a[0]+'+'); 
   }

  if(e.getSource()==b[16])   //=
   {  q=tf.getText();
     char a[]=q.toCharArray();
     ans=(int)(a[0]-48)+(int)(a[2]-48);
    tf.setText(Integer.toString(ans));
   }





}
   public static void main(String...s)
   {
    new Calc("calculator");
   }

}