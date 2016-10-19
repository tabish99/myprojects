package org.tabish.bgc;

class StringDemo
{
//111111111 
   static int wordcount(String s)
    {
       int i,j=0;
      for(i=0;i<s.length();i++)
       {
          char ch=s.charAt(i);           
           if(ch==' ')
            j++;
       } 
      return j+1;
   }

//222222222
   static int spacecount(String s)
    {
       int i,j=0;
      for(i=0;i<s.length();i++)
       {
          char ch=s.charAt(i);           
           if(ch==' ')
            j++;
       } 
      return j;
   }

//33333333
   static int charcount(String s)
    {
       int i,j=0;
      for(i=0;i<s.length();i++)
       {
          char ch=s.charAt(i);           
           if(ch!=' ')
            j++;
       } 
      return j;
   }

//444444
   static String reverse(String s)
    { 
       char c;
        int l=s.length();      
        int i; 
      char ch[]=new char[s.length()];       
      for(i=s.length();i>0;i--)
       {
          ch[s.length()-i]=s.charAt(i-1);                     
       }

      /*   for(i=l;i>(l+1)/2;i--)
       {    c=s.charAt(l-i);
             s.charAt(l-i)=s.charAt(i);
              s.charAt(i)=c;                            
       }*/
        
   String s1=new String(ch); 
      return s1;
   }

//5555555
    static boolean palindrome(String s)
    {  
        boolean b;   
       int i,j=1;   
       String s1=reverse(s);     
      
       /*for(i=0;i<=s.length()/2;i++)
       {
           if(charAt(i)==charAt(s.length()-i-1))
           {  j=0;
            }
           else
            { break;
            } 
               b=i.equals(s.length()-i-1);
               if(b==false)
                 break;                          
       }
       return b;*/
      b=s.equals(s1);
     return b;    
   }

//6666666666
   static String ltrim(String s)
    {                    
        int i=-1,j=0;
         char c;     
         do
	{i++;
         c=s.charAt(i);	     
	} while(c==' '); 
        
        char ch[]=new char[s.length()-i];         
       for(i=i;i<s.length();i++)
       {
          ch[j++]=s.charAt(i);                     
       }
        String s1=new String(ch);
         System.out.println("size s:"+s.length()+" s1"+s1.length());
      return s1;
   }
 //777777777777  
 static String rtrim(String s)
    {                    
        int i=s.length(),j=0;
         char c;     
         do
	{i--;
         c=s.charAt(i);	     
	} while(c==' '); 
        
        j=i+1;
        char ch[]=new char[j];         
       
     for(i=0;i<j;i++)
       {
          ch[i]=s.charAt(i);                     
       }
        String s1=new String(ch);
         System.out.println("size s:"+s.length()+" s1"+s1.length());
      return s1;
   }
//888888888888
   static String alltrim(String s)
    {   
       int i=-1,j=0,k=0,m=0;
         char c;     
         do
	{i++;
         c=s.charAt(i);	     
	} while(c==' ');
         j=i;   //no of ldng spc              
        
        i=s.length();
         do
	{i--;
         c=s.charAt(i);	     
	} while(c==' ');         
        k=j+s.length()-i-1;
        
     char ch[]=new char[s.length()-k];
                        
     for(i=j;i<s.length()+j-k;i++)
       {
          ch[m++]=s.charAt(i);                     
       }
        String s1=new String(ch);
         System.out.println("size s:"+s.length()+" s1"+s1.length());
      return s1;
   }
    //99999999999999999

     static String squeeze(String s)
      {
          int i=0,j=0;
             while(i<s.length())  
                 {
                      if(s.charAt(i)!=' ')  
                        {j++;}
                    
                   i++;
                 }
                 System.out.println(s.length()+" "+j);
           char ch[]=new char[j+1];
                j=0;
                i=0;  
                while(i<s.length())  
                 {
                      if(s.charAt(i)!=' ')                          
                       { ch[j]=s.charAt(i);
                            j++;
                       }        
                   i++;
                  }
                  String s1=new String(ch);
            return s1;
      }
//1010101010101010101010101010

static int vowelcount(String s)
{ 
 int i=0,j=0;
     while(i<s.length())
     {   
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='u')
            {j++;
            } 
       i++;   
     }
return j;

}
//11 11 11 11

static int length(String s)
{ 
     int i=0,j=0;
try{     while(s.charAt(i)!='\0')     
      {            
           i++;
      }
    
   }
   catch(Exception e)
        {
	}
  return i;
}
//12 12 12 12 12 12
static void sequencecount(String s)
{
  int i=0,j=0,k=0;
  char c;
       System.out.println(s.length());
        while(i<s.length())
        {
         c=s.charAt(i);
          while(j<s.length())
           {
             if(c==s.charAt(j))
               {k++;
                 j++;               
               }
               else
               {
                 System.out.println(s.charAt(i)+"="+k);                                 
                 k=0; 
                 break;
               }
            }
            if(j==s.length()) 
              System.out.println(s.charAt(i)+"="+k);
           i=j;                               
        }
}

//13 13 13 13 13
static void frequencycount(String s)
{
  int i=0,j=0,k=0;
  char c;
   char ch[]=new char[s.length()];
       System.out.println(" ");
        while(i<s.length())
        {
         c=s.charAt(i);
            while(c!=ch[k])      
            {k++;
               if(k==s.length())
                 break;        
             }
        
            
               
              if(k>=s.length())
        	{ k=0;
                   j=0;
               	 while(j<s.length())
         	   {
         	    if(c==s.charAt(j))
         	      {k++;               
                      }
         	    j++;                               
        	   }
             
                   System.out.println(s.charAt(i)+"="+k); 
                   k=0; 
                   ch[i]=s.charAt(i);                                      
                }
         i++; 
        }
}


//14 14 14 14 14 14
static String changecase(String s) 
{
char c[]=new char[s.length()];   
   int i=0;
   String s1;
   while(i<s.length())
    {
      if(s.charAt(i)>95)        
       {
        c[i]=(char)(Integer.valueOf(s.charAt(i))-32);
       }
        else
       { 
     
         c[i]=(char)(Integer.valueOf(s.charAt(i))+32);
       }
       i++;
    }//s.valueOf(Integer.valueOf(s.charAt(i))+32);
    s1=new String(c);

return s1;
}



//15 15 15 15 15 15
static void singleOccurance(String s)
{
   System.out.println( "ha mai hu pagal"+s.charAt(0));
     int i=0;
  for(i=1;i<s.length();i++)
    {
      if(s.charAt(i)!=s.charAt(i-1))
        System.out.print(s.charAt(i));
    } 
}

//16 16 16 16 16
static void sortedOrder(String s)
{
char ch[]=new char[s.length()];
  int i=0,j=0;
     char k; 
     
     /*for(i=0;i<s.length();i++)
      {
       ch[i]=s.charAt(i);
       }
     */
        //or  
         ch=s.toCharArray();

 
     for(i=0;i<s.length();i++)
      {
        for(j=i+1;j<s.length();j++)
          { 
            if(s.charAt(i)>s.charAt(j))
             {
                 k=ch[i];        
                 ch[i]=ch[j];
                 ch[j]=k; 
             }
          }
       }
  System.out.println();
  System.out.println(new String(ch));
}
 
//17 17 17 17 17
static void sortedWord(String s1)
{
 int i=0,j=0,k=0,countspace=0,l=0,p=0,x=0;
 char ch[]=s1.toCharArray();
  
	while(i<s1.length())
	 {    if(ch[i]==' ')
                {  
 		  countspace++;       	
                    if(k>p){p=k;k=-1;}  
	        }
           i++;
 	   k++;
	  }   
          if(k>p){p=k;}	
       String s[]=new String[countspace+1];
	char ch1[]=new char[p+1];
      i=0;k=0;
  
 while(i<countspace+1)
   {    
        while(ch[k]!=' ')
         {
           ch1[l++]=ch[k++];
             if(k==ch.length)
                 break;
          }k++;
       s[i++]=new String(ch1);
          l=0;
            for(j=0;j<ch1.length;j++)
            {
                ch1[j]=' ';
            }

       if(i>=countspace+1)
                 break;
    }

for(i=0;i<countspace+1;i++)
      {
       System.out.println(s[i]);
       }

for(i=0;i<countspace+1;i++)
      {
        for(j=i+1;j<countspace+1;j++)
         {
           if(comparet(s[i],s[j])==1)
             { char ch3[]=s[i].toCharArray();
               char ch4[]=s[j].toCharArray(); 
               s[i]=new String(ch4);
               s[j]=new String(ch3); 
                   for(k=0;k<p;k++)
            		{
                	ch3[k]=' ';ch4[k]=' ';
            		}
             }
          }
       }

     for(i=0;i<countspace+1;i++)
      {
       System.out.println("="+s[i]);
      }
   
}
/////////
static int comparet(String s1,String s2)
{
int i=0,x=0;
char ch1[]=s1.toCharArray();
char ch2[]=s2.toCharArray();


      while(ch1[i]==ch2[i])
       { i++; 
           if(i==ch1.length||i==ch2.length) 
              {break;}
       }  
if(ch1.length==ch2.length && i==ch1.length)
{         x=0;
}
else
{
  if(ch1.length!=ch2.length) 
   {
       if(ch1.length>ch2.length)
            x=1;
   }
    else    
      if(ch1[i]>ch2[i])
         x=1;
}
       return x;
}

//18 18 18 18
 static String replace(String s1,String b,String c1)
  {
   int i=0,j=0,k=0,countspace=0,l=0,p=0,x=0;
 char ch[]=s1.toCharArray();  
	while(i<s1.length())
	 {    if(ch[i]==' ')
                {  
 		  countspace++;       	
                    if(k>p){p=k;k=-1;}  
	        }
           i++;
 	   k++;
	  }   
          if(k>p){p=k;}	
       String s[]=new String[countspace+1];
	char ch1[]=new char[p+1];
      i=0;k=0;  
 while(i<countspace+1)
   {    
        while(ch[k]!=' ')
         {
           ch1[l++]=ch[k++];
             if(k==ch.length)
                 break;
          }k++;
       s[i++]=new String(ch1);
          l=0;
            for(j=0;j<ch1.length;j++)
            {
                ch1[j]=' ';
            }
       if(i>=countspace+1)
                 break;
    }
for(i=0;i<countspace+1;i++)
      {
       System.out.println(s[i]);
         if(s[i].equals(b))
            s[i]=c1;
      }
      s1="";
  for(i=0;i<countspace+1;i++)
      {
       s1=s1+s[i];
       }
return s1;
}

//20 20 20 20 20
static boolean equals(String s1,String s2)
{   int x=0;
     int i=0;
  char ch1[]=s1.toCharArray();
  char ch2[]=s2.toCharArray();
     int t=1;
 if(ch1.length==ch2.length)      
  { 
   try{ while(ch1[i]==ch2[i])
         {  i++;   x=1;         
         }               
      }catch(Exception e){System.out.println();} 
    
  }
  if(x==1)
     return true;
        else 
     return false;
   
}

//21 21 21 21 21 21 21
public static void triangle1(String s)
{
  char ch[]=s.toCharArray();
int i=0,j=0,k=0;
  for(i=0;i<s.length();i++)
  { j=0;
    while(j<=i)
      {
        System.out.print(ch[j++]);
      }  
         System.out.println();
  }
}  
//22 22 22 22 22
public static void triangle2(String s)
{
  char ch[]=s.toCharArray();
int i=0,j=0,k=0;
  for(i=s.length();i>0;i--)
  { j=0;
    while(j<i)
      {
        System.out.print(ch[j++]);
      }  
         System.out.println();
  }
}

//23 23 23 23 23
public static void triangle3(String s)
{
  char ch[]=s.toCharArray();
   int i=0,j=0,k=0;
  for(i=s.length();i>0;i--)
  { j=0;
       while(j<s.length()-i)
          {
            System.out.print(" ");
            j++;
          }                
      while(j<s.length())
      {  
          System.out.print(ch[j++]);
      }  
         System.out.println();
  }
}  


//24 24 24 24 24 24
public static void triangle4(String s)
{
   char ch[]=s.toCharArray();
int i=0,j=0,k=0;
 try{ for(i=s.length();i>0;i--)
  { j=0;
    while(j<i)
      {
        System.out.print(ch[j++]);
      } 
        j=0;  
    while(j<s.length()-i)
          {
            System.out.print("  ");
            j++;
          }
          j=k++;      
      while(j<s.length())
      {  
          System.out.print(ch[j++]);
      }  
        System.out.println(); 
  }
 }catch(Exception e){}
} 

//25 25 25 25 25 25 
static int compare(String s1,String s2)
{
int i=0,x=0;
char ch1[]=s1.toCharArray();
char ch2[]=s2.toCharArray();
try{

      while(ch1[i]==ch2[i])
       { i++; 
       }  
 
if(ch1[i]>ch2[i])
         x=1;
        else if(ch1[i]<ch2[i])  
             x=-1;
           else x=0;  
 }catch(Exception e){}
    return x;
}


//26 26 26 26 26 26 
static void frequencyCount(String s1)
{
//same as 17sortedword 
int i=0,j=0,k=0,countspace=0,l=0,p=0,x=0;
 char ch[]=s1.toCharArray();
  
	while(i<s1.length())
	 {    if(ch[i]==' ')
                {  
 		  countspace++;       	
                    if(k>p){p=k;k=-1;}  
	        }
           i++;
 	   k++;
	  }   
          if(k>p){p=k;}	
       String s[]=new String[countspace+1];
	char ch1[]=new char[p+1];
      i=0;k=0;
  
 while(i<countspace+1)
   {    
        while(ch[k]!=' ')
         {
           ch1[l++]=ch[k++];
             if(k==ch.length)
                 break;
          }k++;
       s[i++]=new String(ch1);
          l=0;
            for(j=0;j<ch1.length;j++)
            {
                ch1[j]=' ';
            }

       if(i>=countspace+1)
                 break;
    }

for(i=0;i<countspace+1;i++)
      {
       System.out.println(s[i]);
       }

for(i=0;i<countspace+1;i++)
      {
        for(j=i+1;j<countspace+1;j++)
         {
           if(comparet(s[i],s[j])==1)
             { char ch3[]=s[i].toCharArray();
               char ch4[]=s[j].toCharArray(); 
               s[i]=new String(ch4);
               s[j]=new String(ch3); 
                   for(k=0;k<p;k++)
            		{
                	ch3[k]=' ';ch4[k]=' ';
            		}
             }
          }
       }
        k=1;
        j=0;
        l=j+1;
     System.out.println(countspace+1);
      for(i=0;i<countspace+1;i++)
      {
       System.out.println("="+s[i]);
      }
     for(i=0;i<countspace+1;i++)
      {   
             while(s[j].equals(s[l]))
              { j=j+1;
                  k=k+1;
                 l=l+1; 
              }    
              k=k+1;                               
      	    System.out.println(s[j] +j+ "=" + k);
                 k=0;
               j=j+1;
               l=l+1;
              i=j;
      
      }
        System.out.println(s[j++]+"="+(k+1));

}

public static void main(String...s)
   {      System.out.println("no of word is:"+wordcount("my name is alk plk clk")); 
      System.out.println("no of space is:"+spacecount("my na m e is alk plk clk")); 
      System.out.println("no of char is:"+charcount("my na m e is alk plk clk")); 
      System.out.println("reverse string  is:"+reverse("my na m e is alk plk clk")); 
      System.out.println("is string palindrome:"+palindrome("madam")); 
       System.out.println("ltrim string:"+ltrim("   m  a  da    mllgm")); 
       System.out.println("rtrim string:"+rtrim("m  a  da    mllgm   ")); 
      System.out.println("aaltrim string:"+alltrim("     mada m llgm    ")); 
      System.out.println("squeeze string:"+squeeze("     m a d   a   m  is in mubarakpur saree   ")); 
      System.out.println("no of vowels:"+vowelcount("     m a d   a   m  is in mubapur saree   ")); 
      System.out.println("length is:"+length("a a a b  ")); 
      sequencecount("nniimmtiiikk");     
      frequencycount("nniimmtiiijj"); 
      System.out.println("changecase:"+changecase("aSdFgHiJm"));	
      singleOccurance("nniittiin");     
      sortedOrder("dfghcba");     
      sortedWord("zzs zzzu wwz aa z a ww uu aaa yyc aaz x ww yya bbbbb uu");
      System.out.println(replace("india is good na","good","best")); 
        System.out.println(equals("india","india"));    
        triangle1("ducat"); 
        triangle2("ducat");   
        triangle3("ducat");    
        triangle4("ducat"); 
     System.out.println("compareto"+compare("helok","helok"));
     frequencyCount("ghi abc cdf abc abc def ghi jkl ghi mno");
    
  }
}