class Tem
{
	
	Tem()
	{  this(10);
		System.out.println("in constructor");
	}
	
	Tem(int x)
	{   
		System.out.println("in args constructor "+x);
	}
	
   int x=10;
   void show(int x)
   {
       System.out.println(x); //20
       System.out.println(this.x);
	// System.out.println(z.x);  
   }   
  
    void show(int x,Tem z)
   {
       System.out.println(x); //20
       System.out.println(z.x);// 10 
       System.out.println(this.x);//10
       System.out.println("this="+this);
       System.out.println("object="+z);
        
   }  

   public static void main(String...s)
   {
     Tem t=new Tem();
       t.show(20);   //both are equal
       t.show(20,t);
      

      // o/p 20 10 20 10 10

   }

}

