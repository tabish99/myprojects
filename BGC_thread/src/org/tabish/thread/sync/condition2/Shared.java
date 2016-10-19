class Shared
{
  int x=0;

	synchronized void show(String s,int a)   //Synchronized
	{
          x=a;
            System.out.println("Starting in method"+s+" "+x);
          try
           { 
             Thread.sleep(2000);       
            }catch(Exception e){System.out.println(e);}
             
             System.out.println("ending from method"+s+" "+x);
	}


         synchronized void show1(String s,int a)   //Synchronized
	{
          x=a;
            System.out.println("Starting in method"+s+" "+x);
          try
           { 
             Thread.sleep(2000);       
            }catch(Exception e){System.out.println(e);}         
             System.out.println("ending from method"+s+" "+x);
	}
       
       

       void show10(String s,int a)   //Synchronized
	{
          x=a;
            System.out.println("Starting in method"+s+" "+x);          
           try
           { 
             Thread.sleep(2000);       
           }catch(Exception e){System.out.println(e);}                     
             System.out.println("ending from method"+s+" "+x);
	}


}
