import java.awt.*;
import java.awt.event.*;

class EventDemo implements ActionListener
{
	Frame f;
	Button b,b1;
	TextField tf;
	
 		EventDemo(String s)
		{
			f=new Frame(s);
			b=new Button("ok");
			b1=new Button("cancel");
			b.setBounds(20,100,40,40);
			b1.setBounds(20,180,40,40);
			f.add(b);
			f.add(b1);
			tf=new TextField();
			tf.setBounds(20,40,100,40);
			f.add(tf);
			f.setLayout(null);
			f.setSize(400,400);
			f.setVisible(true);
                        b.addActionListener(this);
                        b1.addActionListener(this);
		
			//Outer o=new Outer(this);
			//f.add(o);	
        		MouseEventListener wml=new MouseEventListener(this);	 	
			f.addMouseListener(wml);

			WindowEventListener wel=new WindowEventListener();
			f.addWindowListener(wel);

                        KeyEventListener kel=new KeyEventListener();
                        f.addkeyEventListener(kel);
                     
		}
	
	public void actionPerformed(ActionEvent e)
 		{
			if(e.getSource()==b)
			tf.setText("ok");			
			if(e.getSource()==b1)
			tf.setText("cancel");
		}
		
		public static void main(String...s)
		{
 			new EventDemo("myFrame");
		}
	
}











