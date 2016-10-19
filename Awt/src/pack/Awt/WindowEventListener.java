import java.awt.*;
import java.awt.event.*;

class WindowEventListener extends WindowAdapter
{
	public void windowClosing(WindowEvent e1)
	{
	System.exit(0);
	}
}