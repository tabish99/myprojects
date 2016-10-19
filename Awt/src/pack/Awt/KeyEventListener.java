import java.awt.*;
import java.awt.event.*;

class KeyEventListener extends KeyAdapter
{
	public void keyTyped(KeyEvent e)
 	{
		System.out.println(e.getKeyChar());
	}
}