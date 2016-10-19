import java.io.*;
import java.net.*;

class UdpClient
{
   public static void main(String...s)throws Exception
    {
      DatagramSocket ds=new DatagramSocket();
      String s="india is great country";  
       byte b[]=s.getbytes();
      
      DatagramPacket dp=new DatagramPacket(b,b.length,InetAddress.getLocalhost(),8);
      ds.send(dp);
    }
}