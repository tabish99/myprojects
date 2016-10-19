import java.awt.*;
import java.awt.event.*;
class Test implements ActionListener
{
Frame f;
Button b;       
TextField tf1,tf2;

  Test( String s)
   {
         f=new Frame(s);      

         b=new Button("submit");
         b.setBounds(300,300,50,50);
          b.addActionListener(this);        
           f.add(b);
           
             
         tf1=new TextField();
         tf1.setBounds(100,100,100,50);
         f.add(tf1);
         
         tf2=new TextField();
         tf2.setBounds(250,100,150,50);
         f.add(tf2);
           
          
            f.setLayout(null); 
           f.setSize(500,500);
           f.setVisible(true);
             
    }




  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==b)
    { 		// if(tf1.getText()=="tanveer khan")
      		 //tf2.setText("conflict haleema akhtar/manvi shankar");   //tf1.getText()

            
       tf2.setText(tf1.getText());


    }
  }

	public static void main(String...s)
	{

	new Test("Test Frame");

	}

}