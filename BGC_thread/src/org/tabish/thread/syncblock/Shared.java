class Shared
{
  int x;
  void show(String s,int a)
   { 
     System.out.println("strarting in method"+s);
      synchronized(this)
      {
        x=a;
        System.out.println("strarting in block"+s+" "+x);
        try
        { Thread.sleep(1000);
        } catch(Exception e){}; 
        System.out.println("ending in block"+s+" "+x);        
      }
    }
}

//OR lock is maintained on other object
/*
class Shared
{
  int x;
   Temp t=new Temp();
  void show(String s,int a)
   { 
     System.out.println("strarting in method"+s);
      synchronized(t)                                 //make a class synchronized
      { t.tupagalhai(s);
      }         
    }
}
*/