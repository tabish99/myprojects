package org.tabish.bgc;
class Demo
{     //111111111111
	static int max(int a[])
   	{
	 int max,i=0;
         max=a[i];   
          for(i=0;i<a.length;i++) 
		{
                  if(max<a[i])
                      max=a[i]; 
	 	}	 	
          return max;
	}
           
         static int max1(int a[][])
   	{
	 int max,i=0,j=0;
         max=a[i][j];   
          for(i=0;i<a.length;i++) 
		{ 
                   for(j=0;j<a[i].length;j++) 
		   {
                    if(max<a[i][j])
                      max=a[i][j];
		   }	 
	 	}	 	
          return max;
	}

//222222222222
         static int min(int a[])
   	{
	 int min,i=0;
         min=a[i];   
          for(i=0;i<a.length;i++) 
		{
                  if(min>a[i])
                      min=a[i]; 
	 	}	 	
          return min;
	}
       
         static int min1(int a[][])
   	{
	 int min,i=0,j=0;
         min=a[i][j];   
          for(i=0;i<a.length;i++) 
		{ 
                   for(j=0;j<a[i].length;j++) 
		   {
                    if(min>a[i][j])
                      min=a[i][j];
		   }	 
	 	}	 	
          return min;
	}
	
	static void sort(int a[])
	{
          int m,i=0,j=1;   
          for(i=0;i<a.length;i++) 
		{  
                    for(j=1+i;j<a.length;j++)
                    {
 	               if(a[i]<a[j])
                       {}
 		      else
           	       {   m=a[i];
			a[i]=a[j];
			a[j]=m;
                       }			  	 
                   }
	 	}
   	 System.out.println("sorted array is ");	 	
         System.out.print("ascending ");   
          for(i=0;i<a.length;i++)
          System.out.print(a[i] + " ");
           System.out.println();          
          System.out.print("descending ");   
           for(i=0;i<a.length;i++)
          System.out.print(" " + a[a.length-1-i]);        
  		
	}

	
	static void sort1(int a[][])
	{
          int m,i=0,j=0,k=0,l=0,n=1,b=0,r=1;   
            for(k=0;k<a[l].length;k++) 
	      {
		for(i=b;i<a.length;i++) 
		{       
                    for(j=n;j<a[i].length;j++)
                    {
 	               if(a[l][k]<a[i][j])
                       {}
 		      else
           	       {   m=a[l][k];
			a[l][k]=a[i][j];
			a[i][j]=m;
                       }			  	 
                    }n=0;
	 	}
		
		r++;n=r;
                
		if((a[l].length-1)==(k+1))
		{			  //row length
		      n=0; b++; r=0;             	
		}
		
		if(a[l].length==(k+1))
 		{
		l++;n=1;b=l;
		k=-1;	
		}
		if(l==a.length)
		   break;
		  
             }
   	   System.out.println( );	 	
           System.out.println("ascending          descending");        
           for(i=0;i<a.length;i++)
           { for(j=0;j<a[i].length;j++)
   	     { System.out.print(a[i][j] + " ");          	       
             }System.out.print("          ");

	     for(j=0;j<a[i].length;j++)
   	     {System.out.print(a[a.length-1-i][a.length-1-j] + " ");        
             }System.out.println( );       	                   
           } 	  
       }
	
	  static void merge_sort(int a[],int b[])
          { 
            int i=0;
	     int z[]=new int[a.length+b.length];
           for(i=0;i<a.length;i++) 
            {   
	       z[i]=a[i];	  		  	
	    }
	    for(i=0;i<b.length;i++) 
            {      
		  z[a.length+i]=b[i];		  	
	    }
              System.out.print("merge sort");
               System.out.println(); 			
	       sort(z); 		 		
	  }		
        
            static void union(int a[],int b[])
	  {
		int k=0,i=0,j=0,m=0;	
                int z[]=new int[a.length+b.length];     
            for(i=0;i<a.length;i++) 
            {   
	       z[i]=a[i];	  		  	
	    }  


	     for(i=0;i<b.length;i++) 
              {     m=0; 
	         for(j=0;j<a.length;j++) 
                {      
		  if(a[j]==b[i])
                  {
		      m=1;	
		   		                    	    
		  }    
                }
		  if(m!=1)
                   z[a.length+k++]=b[i];
              }System.out.println( );  
               System.out.print("union"+ " "); 
             for(j=0;j<z.length;j++)
   	     { System.out.print(z[j]+ " ");          	       
             }

	  }

	  static void intersection(int a[],int b[])
	  {
		int k=0,i=0,j=0;	
                int z[]=new int[a.length+b.length];     
               for(i=0;i<a.length;i++) 
              {      
	         for(j=0;j<b.length;j++) 
                {      
		  if(a[i]==b[j])
                  {
			
		   z[k++]=a[i];  		  	
                  	    
		  }    
                }
              }System.out.print("intersection"+ " "); 
             for(j=0;j<z.length;j++)
   	     { System.out.print(z[j]+ " ");          	       
             }

	  }
           
          static void matrixadd(int a[][],int b[][])
	{
	    int z[][]=new int[a.length][];
            
          int i=0,k=0; 
            for(k=0;k<a.length;k++) 
	      {z[k]=new int[a[k].length];
	       }
   
            for(k=0;k<a.length;k++) 
	      {
		 for(i=0;i<a[k].length;i++) 
		 {       
                   z[k][i]=a[k][i]+b[k][i];
	 	 }   
               }
                 System.out.println(); System.out.println("matrix sum");
	     for(k=0;k<a.length;k++) 
	      {
		 for(i=0;i<a[k].length;i++) 
		 {       
                 System.out.print(a[k][i] + "  ");
	 	 } 
                   System.out.print("  ");
                  for(i=0;i<a[k].length;i++) 
		 {       
                 System.out.print(b[k][i] + "  ");
	 	 } System.out.println(); 
               }   
               
                   System.out.println(); 
              for(k=0;k<a.length;k++) 
	      { System.out.print("           ");
                 
		 for(i=0;i<a[k].length;i++) 
		 {       
                   System.out.print(z[k][i] + "  ");
	 	 }  System.out.println(); 
               }
           }

               
          static void matrixmult(int a[][],int b[][])
	{
	    int z[][]=new int[a.length][];
            
          int i=0,j=0,k=0; 
            for(k=0;k<a.length;k++)     
	      {z[k]=new int[b[k].length];
	       }
   
            for(k=0;k<a.length;k++) 
	      {
		 for(i=0;i<b[k].length;i++) 
		 { 
                    for(j=0;j<a[k].length;j++) 
		    {      
                     z[k][i]+=a[k][j]*b[j][i];
	 	    }
		 }   
               }
                 System.out.println(); System.out.println("matrix mult");
	     for(k=0;k<a.length;k++) 
	      {
		 for(i=0;i<a[k].length;i++) 
		 {       
                 System.out.print(a[k][i] + "  ");
	 	 } 
                   System.out.println();
              }   
		System.out.println();
		for(k=0;k<b.length;k++) 
	      {
		 for(i=0;i<b[k].length;i++) 
		 {       
                 System.out.print(b[k][i] + "  ");
	 	 } System.out.println(); 
               }   
               
                   System.out.println("multiplication"); 
              for(k=0;k<z.length;k++) 
	      { 
                 for(i=0;i<z[k].length;i++) 
	         {
                  System.out.print(z[k][i] + " "); 
                  }
                   System.out.println();  
              }  
          }              
      static void matrixadd(int a[][])
	{
          int i=0,j=0,sumr=0,s=0,p=0;   
             System.out.println("matrix sum");
                    
               for(i=0;i<a.length;i++) 
	      {
		 for(j=0;j<a[i].length;j++) 
		 {       
                  sumr+=a[i][j];
                  System.out.print("   " + a[i][j] + "  ");
	 	 }   System.out.print(" " + sumr);
                    System.out.println();
                    System.out.println();
                    
                     sumr=0;
              }
              i=0;
                for(j=0;j<a.length;j++) 
                     {  
                        p+=a[j][j];
                        s+=a[a.length-j-1][j];
                     } 
                         System.out.print(s+ "   ");
              
               for(i=0;i<a.length;i++)    
	      {
		 for(j=0;j<a.length;j++) 
		 {       
                  sumr+=a[j][i];
                  
	 	 }   System.out.print(sumr + "   ");
                    
                     sumr=0;
              }
               System.out.print("  " + p);
                    
           }

	   static void traingleAsum(int a[][])
	{
          int i=0,j=0,sum=0;
                System.out.println();    
               System.out.println("traingle sum a");   
            for(i=0;i<a.length;i++) 
	      { 
		 for(j=i;j<a[i].length;j++) 
		 {       
                  sum+=a[i][j];                                  
	 	 }  
                     
              }
               System.out.println();    
               
               for(i=0;i<a.length;i++)    
	      {
		 for(j=0;j<a.length;j++) 
		 {       
                   System.out.print(" "+a[i][j]+ " ");
                     
	 	 }   
                System.out.println();                                        
              } 
              System.out.println(sum);
          }
 
              static void traingleAmax(int a[][])
	{
          int i=0,j=0,max=0;
                System.out.println();    
               System.out.println("traingle  max no");   
               max=a[0][0];
              for(i=0;i<a.length;i++) 
	      { 
		 for(j=i;j<a[i].length;j++) 
		 {  if(max<a[i][j])      
                      max=a[i][j];                              
	 	 }  
                     
              }
               System.out.println();    
               
               for(i=0;i<a.length;i++)    
	      {
		 for(j=0;j<a.length;j++) 
		 {       
                   System.out.print(" "+a[i][j]+ " ");
                     
	 	 }   
                System.out.println();                                        
              } 
              System.out.println(max);
          }
	  
            static void traingleAmin(int a[][])
	{
          int i=0,j=0,min=0;
                System.out.println();    
               System.out.println("traingle min no");   
               min=a[0][0];
              for(i=0;i<a.length;i++) 
	      { 
		 for(j=i;j<a[i].length;j++) 
		 {  if(min>a[i][j])      
                      min=a[i][j];                              
	 	 }  
                     
              }
               System.out.println();    
               
               for(i=0;i<a.length;i++)    
	      {
		 for(j=0;j<a.length;j++) 
		 {       
                   System.out.print(" "+a[i][j]+ " ");
                     
	 	 }   
                System.out.println();                                        
              } 
              System.out.println(min);
          } 
         
          static void traingleBsum(int a[][])
	{
          int i=0,j=0,sum=0;
                System.out.println();    
               System.out.println("traingle sum B");   
            for(i=0;i<a.length;i++) 
	      { 
		 for(j=0;j<=i;j++) 
		 {       
                  sum+=a[i][j];                                  
	 	 }  
                     
              }
               System.out.println();    
               
               for(i=0;i<a.length;i++)    
	      {
		 for(j=0;j<a.length;j++) 
		 {       
                   System.out.print(" "+a[i][j]+ " ");
                     
	 	 }   
                System.out.println();                                        
              } 
              System.out.println(sum);
          }
 
              static void traingleBmax(int a[][])
	{
          int i=0,j=0,max=0;
                System.out.println();    
               System.out.println("traingle  max no");   
               max=a[0][0];
              for(i=0;i<a.length;i++) 
	      { 
		 for(j=0;j<=i;j++) 
		 {  if(max<a[i][j])      
                      max=a[i][j];                              
	 	 }  
                     
              }
               System.out.println();    
               
               for(i=0;i<a.length;i++)    
	      {
		 for(j=0;j<a.length;j++) 
		 {       
                   System.out.print(" "+a[i][j]+ " ");
                     
	 	 }   
                System.out.println();                                        
              } 
              System.out.println(max);
          }
	  
            static void traingleBmin(int a[][])
	{
          int i=0,j=0,min=0;
                System.out.println();    
               System.out.println("traingle min no");   
               min=a[0][0];
              for(i=0;i<a.length;i++) 
	      { 
		 for(j=0;j<=i;j++) 
		 {  if(min>a[i][j])      
                      min=a[i][j];                              
	 	 }  
                     
              }
               System.out.println();    
               
               for(i=0;i<a.length;i++)    
	      {
		 for(j=0;j<a.length;j++) 
		 {       
                   System.out.print(" "+a[i][j]+ " ");
                     
	 	 }   
                System.out.println();                                        
              } 
              System.out.println(min);
          }     
				
public static void main(String...s)
         {
	   System.out.println("maximum value is "+max(new int[]{10,20,2,1,9,4,6,7,0}));
	   System.out.println("minimum value is "+min(new int[]{10,20,2,1,9,4,6,7,0,-9}));
	   System.out.println("maximum1 value is "+max1(new int[][]{{10,20,2,1},
								    {2,4,-1,5},
								    {34,89,9,8},
								    {12,89,34,2}
								    }));
	  System.out.println("minimum1 value is "+min1(new int[][]{{10,20,2,1},
								    {2,4,-1,5},
								    {34,89,9,8},
								    {12,89,34}
								    }));
	  
          
	  sort(new int[]{10,20,2,1,34,56,9 });

           
	   sort1(new int[][]{{15,14,13,12},
			    {11,10,9,8},
			    {7,6,5,4},
  			    {3,2,1,0}
              	             });
            merge_sort(new int[]{10,20,2,1,34,56,9},new int[]{13,10,21,11,4,6,9,8,5,7,1,2});
   	   union(new int[]{10,20,2,1,34,56,9},new int[]{13,10,21,11,4,6,9,8,5,7,1,2});
   	    System.out.println(); 
	   intersection(new int[]{10,20,2,1,34,56,9},new int[]{13,10,21,11,4,6,9,8,5,7,1,2});
   	   matrixadd(new int[][]{{10,20,2,1},
			         {2,4,9,1},
			         {34,89,9,8},
			         {12,89,34}
			        },
		     new int[][]{{10,20,2,1},
			         {2,4,9,1},
			         {34,89,9,8},
			         {12,89,34}
			        });
 	  matrixmult(new int[][]{{1,2,2,1},
			         {2,4,9,1},
			         {3,2,1,5},
			         {1,3,4,1}
			        },
		     new int[][]{{1,2,2},
			         {2,4,9},
			         {3,2,1},
			         {1,3,4}
			        });
          
  	  matrixadd(new int[][]{ {10,20,2,1},
			         {2,4,9,1},
			         {34,89,9,8},
			         {12,89,34,13}
			       });
         
       traingleAsum(new int[][]{ {10,20,2,1},
			         {2,4,9,1},
			         {34,89,9,8},
			         {12,89,34,13}
			       });
        traingleAmax(new int[][]{ {10,20,2,1},
			         {2,4,9,1},
			         {34,89,9,8},
			         {12,89,34,13}
			       });
  
         traingleAmin(new int[][]{ {10,20,2,1},
			         {2,4,9,1},
			         {34,89,9,8},
			         {12,89,34,13}
			       });

 	   traingleBsum(new int[][]{ {10,20,2,1},
			         {2,4,9,1},
			         {34,89,9,8},
			         {12,89,34,13}
			       });
        traingleBmax(new int[][]{ {10,20,2,1},
			         {2,4,9,1},
			         {34,89,9,8},
			         {12,89,34,13}
			       });
  
         traingleBmin(new int[][]{ {10,20,2,1},
			         {2,4,9,1},
			         {34,89,9,8},
			         {12,89,34,13}
			       });
			  		 							
	 }         

}

