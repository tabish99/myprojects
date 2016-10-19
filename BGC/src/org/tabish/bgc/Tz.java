package org.tabish.bgc;
interface My
{               
void show();  // by defalt public and abstract  .... (all non fnl mthd of object class present )
}

class Tz extends Temp implements My
{
    
    public static void main(String...s)
    {
          My m=new Tz(); //(non final object method is present in every interface)
           m.show();
              
 
          Tz t=new Tz();       //can be run normal situation (parent(temp) method run  by same reference variable) 
            t.show();                         
           System.out.println("hello"+t.x); 
    }
}


class Temp 
{ 
   int x=100;
  
  public void show()
  { 
    System.out.println("aaila ye kya hua program run ho gaya");
   
  }
}