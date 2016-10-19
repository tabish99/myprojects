import java.awt.*;
import java.awt.event.*;

class MouseEventListener extends MouseAdapter
{
	EventDemo f;
	
	MouseEventListener(EventDemo f)
	{
 		this.f=f;
	}
		
	public void mouseClicked(MouseEvent e1)
	{
		f.tf.setText("MouseEvent");	
		//setBackGround(Color.RED);
	}
}