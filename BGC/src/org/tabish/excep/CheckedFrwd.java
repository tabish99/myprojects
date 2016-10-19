package org.tabish.excep;

import java.io.*;
class CheckedFrwd
{

    int read()throws IOException
    {
     return System.in.read();
    }
  
    int display()throws IOException
    {
    System.out.println("Checked exception is forwarded here (which is implicily done in unchecked excp)");
    return read();
    }


    public static void main(String...s)throws IOException
  	{
     	/*CheckedFrwd cf=new CheckdForwarded();
             cf.display();
	*/
	int x=new CheckedFrwd().display();

        System.out.println("**** "+x+"  ***");
        }	



}
