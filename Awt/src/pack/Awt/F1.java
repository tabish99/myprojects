import java.awt.*;
import java.awt.event.*;
class F1 implements ActionListener
{
  Frame f1,f2;
  Button b1,b2;
  TextField tf1,tf2,tf3,tf4;
  Label l1,l2,l3,l4;     
  F1(String s)
  {
     f1=new Frame(s);
     b1=new Button("submit");
     l1=new Label("enter name"); 
     l2=new Label("enter pass");     
     tf1=new TextField();
     tf2=new TextField();    
     l2.setBounds(20,90,100,40);
     tf2.setBounds(140,90,140,40);     
     b1.setBounds(120,150,60,30);
     l1.setBounds(20,40,100,40);
     tf1.setBounds(140,40,140,40);     
       f1.add(b1); 	f1.add(l2);	f1.add(l1);	f1.add(tf1); f1.add(tf2);	
     f1.setSize(600,600);
      f1.setLayout(null);
       f1.setVisible(true);
    b1.addActionListener(this);
  }
 
public static void main(String...s)
{  new F1("myframe");}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1 && tf2.getText()=="tabish")
{
  
       f2=new Frame("new frame");
     b2=new Button("submit");
     l3=new Label("enter name"); 
     l4=new Label("enter pass");     
     tf3=new TextField();
     tf4=new TextField();   
     l3.setBounds(20,90,100,40);
     tf3.setBounds(140,90,140,40);     
     b2.setBounds(120,150,60,30);
     l4.setBounds(20,40,100,40);
     tf4.setBounds(140,40,140,40);     
       f2.add(b2); 	f2.add(l3);	f2.add(l4);	f2.add(tf4); f2.add(tf3);	
     f2.setSize(600,600);
      f2.setLayout(null);
       f2.setVisible(true);
   // b1.addActionListener(this);
  

}





}


}













