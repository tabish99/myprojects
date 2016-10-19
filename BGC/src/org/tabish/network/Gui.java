package org.tabish.network;


  import javax.swing.* ;
    import java.awt.* ;
  import java.awt.event.* ;
   import java.io.*;
import java.net.*;
  class Gui implements ActionListener 
  {
        JFrame frame;
        JTextArea  text;
        JButton button; 
     String msg="";
    
    Socket s;
DataInputStream din;
DataOutputStream dout;
public Gui()
{
try
{
 frame =new JFrame("BROADCAST ME");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLayout(null);
       text = new JTextArea(50,50);
        button=new JButton("Send");
         button.setBounds(400,120,70,20);
       text.setBounds(10,10,400,100);
        button.addActionListener(this);
      text.setBackground(Color.GREEN);
  frame.add(button);
      frame.add(text);
     frame.setVisible(true);
     frame.setSize(500,500);

///////////
s=new Socket("localhost",10);
din=new DataInputStream(s.getInputStream());
dout=new DataOutputStream(s.getOutputStream());
clientChat();
}
catch(Exception e){}
}

public void clientChat()throws IOException
{
My m=new My(din);
Thread t1=new Thread(m);
t1.start();
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s1;
do
{
//s1=br.readLine();
s1=text.getText();;
dout.writeUTF(s1);
dout.flush();
}
while(!equals("stop"));
}



class My implements Runnable
{
DataInputStream din;
My(DataInputStream din)
{
this.din=din;
}

public void run()
{
String s2=" ";
do
{
try
{
s2=din.readUTF();
//System.out.println(s2);
text.setText(s2);

}
catch(Exception e){}
}
while(!s2.equals("stop"));
}
}






   //////// / / // / / / / / /   ///
   
   public static void main(String[] ar) 
      {  Gui gui=new Gui();
         // gui.go(); 
      }

 /* void go() {

      frame =new JFrame("BROADCAST ME");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLayout(null);
       text = new JTextArea(50,50);
        button=new JButton("Send");
         button.setBounds(400,120,70,20);
       text.setBounds(10,10,400,100);
        button.addActionListener(this);
      text.setBackground(Color.GREEN);
  frame.add(button);
      frame.add(text);
     frame.setVisible(true);
     frame.setSize(500,500);
   } // go*/
   
      public  void actionPerformed(ActionEvent ev) 
       {
          if(ev.getSource()==button)
           { }
            else
            {
             } 
       } 



}