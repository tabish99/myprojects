package org.tabish.io.s;


import java.io.*;
class MyStreamTokenizer
{
    public static void main(String...s)throws IOException
    {
        FileInputStream fin=new FileInputStream("abc1.txt");
         StreamTokenizer st=new StreamTokenizer(fin);
 
         st.eolIsSignificant(true);
        st.wordChars(33,255);
        st.whitespaceChars(0,32);       //space=32;
        int token=0;
  
         while(token!=StreamTokenizer.TT_EOF)   // true 
         {
             token=st.nextToken(); 
                 // if(token==StreamTokenizer.TT_EOF)    
                   //       break;
               if(token==StreamTokenizer.TT_NUMBER)
                  System.out.println(st.nval+"number");
                 
                  if(token==StreamTokenizer.TT_WORD)
                  System.out.println(st.sval+"word");
         }  
    }
}