package org.tabish.net.udp;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class UdpClient
{
   public static void main(String...s1)throws Exception
    {
      DatagramSocket ds=new DatagramSocket();
      String s="india is great country";  
       byte b[]=s.getBytes();
      
      DatagramPacket dp=new DatagramPacket(b,b.length,InetAddress.getLocalHost(),8);
      ds.send(dp);
    }
}