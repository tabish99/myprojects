import java.awt.*;
import java.awt.event.*;
class Outer implements ActionListener
{
	EventDemo f;
	Outer(EventDemo f)
	{
		this.f=f;
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==f.b)
		f.tf.setText("lalu");

		if(e.getSource()==f.b1)
		f.tf.setText("rabari");
	}

				
}