package pack.Awt;

import java.awt.Frame;


	//import java.awt.*;

	class Awt1
	{
	    Frame f;
	    Awt1(String s)
	    {
	      f=new Frame(s);
	      f.setSize(400,400);
	      f.setVisible(true); 
	     }

	   public static void main(String...s)
	   {
	    new Awt1("First frame");
	   }
	}


