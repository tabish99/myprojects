package org.tabish.prop_i18n;

import java.util.*;
class MyLocale
{
  public static void main(String...s)
   {
   //  Locale l=new Locale("fr","Fr");
  //  ResourceBundle rb=ResourceBundle.getBundle("App",l); 

       ResourceBundle rb=ResourceBundle.getBundle("App",Locale.getDefault()); 
      System.out.println(Locale.getDefault().toString());
     Enumeration e=rb.getKeys();
       
       while(e.hasMoreElements())
       {
         String k=(String)e.nextElement();
         String v=rb.getString(k);
          System.out.println(k+"="+v);
       }
   }
}