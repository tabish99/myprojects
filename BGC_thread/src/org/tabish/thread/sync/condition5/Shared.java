class Shared
{
   static int x=0;   
    int y=0; 
	synchronized static void show(String s,int a,Shared so)   //Synchronized
	{
           x=a;
            System.out.println("Starting in method"+s+" "+x);
          //so.show1("hack",44);
           try
           { 
             Thread.sleep(2000);       
            }catch(Exception e){System.out.println(e);}
             so.show1("hack",44);
             System.out.println("ending from method"+s+" "+x);
	}

        synchronized void show1(String s,int a)   //Synchronized
	{
          y=a;
           Shared so=new Shared();
            System.out.println("Starting in method"+s+" "+y);
         Shared.show("hack44",444,so);
            try
           { 
             Thread.sleep(2000);       
            }catch(Exception e){System.out.println(e);}
            //  Shared.show("hack44",444,so);
             System.out.println("ending from method"+s+" "+y);
	}

    
}
