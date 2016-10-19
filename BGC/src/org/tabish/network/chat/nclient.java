package org.tabish.network.chat;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.FileDialog;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;

public class nclient {
 
  
//***************************
    public Socket client;
    private File myFile;
	public static String str = "nizam ";

	
 public nclient(int port, String fileName,String ip) throws IOException 
    {
        
        myFile = new File (fileName);
        client = new Socket(ip,port);
System.out.println("Waiting for connection on port "+port); 
            
        
            sendFile();
       
    }
 

 
    public void sendFile() throws IOException 
    {
         
        if (!myFile.exists()) {
            System.out.println("File doesn not exist!");
            System.exit(-1);
        } 
         
        //file do exist
         
        System.out.println("AbsolutePath:" + myFile.getAbsolutePath());
        System.out.println("length: " + myFile.length());
         
        if (myFile.exists()) {
            ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
             
            oos.writeObject(myFile);
        }
         
         
    }
     
     
   
 public static void main(String[] args)throws IOException {

 final Frame f;
final TextField tf,tf1,tf2;
Label l;
 Label l1,l2;
Button b,b1;



f=new Frame("rafi");
f.setLayout(null);


//l=new Label("Select the file name");
l=new Label("Enter srver IP Address :");
l.setBounds(20,40,120,30);
f.add(l);
f.setResizable(true);


tf=new TextField();
tf.setBounds(180,40,200,30);
f.add(tf);

l1= new Label ("Enter port no. ");
l1.setBounds(20,80,100,30);
f.add(l1);

tf1=new TextField();
tf1.setBounds(180,80,50,30);
f.add(tf1);

l2=new Label("Select the file name");
l2.setBounds(20,120,120,30);
f.add(l2);

b=new Button("Browse");
b.setBounds(400,120,70,30);
f.add(b);

tf2=new TextField();
tf2.setBounds(180,120,200,30);
f.add(tf2);

b1=new Button("Submit");
b1.setBounds(180,200,80,30);
f.add(b1);



f.setBackground(Color.GREEN);

f.setSize(500,400);
f.setVisible(true);
f.addWindowListener(new My());




b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ttt)
{

//int port = 9999;

         
JFileChooser chooser=new JFileChooser();
int returnval=chooser.showOpenDialog(null);
if(returnval == JFileChooser.APPROVE_OPTION){ 
File f=chooser.getSelectedFile();
 String raf=f.toString();
String fileName = raf;
 String ip;
 int port;

tf2.setText(raf);   
ip=tf.getText();
port=Integer.parseInt(tf1.getText());
 try {
            nclient fs = new nclient(port,fileName,ip);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

}
}});

b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent tt)
{

Label l3;
l3= new Label("Congrats ...Your File has been SENT....!!!!");
l3.setBounds(25,250,250,40);
 l3.setForeground (Color.red);
l3.setBackground(Color.white);

f.add(l3);
    

}});



}}



class My extends WindowAdapter
{
public void windowClosing(WindowEvent tt)
{
System.exit(0);
}}     