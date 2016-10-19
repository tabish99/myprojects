package org.tabish.prop_i18n;

import java.util.*;
import java.text.*;

class DefaultLocale
{
  public static void main(String...s)
   {   
      Locale list1[]=Locale.getAvailableLocales();
      Locale list[]=DateFormat.getAvailableLocales();
     for(int i=0;i<list1.length;i++)
      {
        System.out.println(list[i].toString());   
        System.out.println(list1[i].toString());
       } 
        
   }


}











