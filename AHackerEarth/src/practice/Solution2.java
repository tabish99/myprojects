package practice;

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int totalt=0;
        int total=0;
        
        
        String binary="";
        boolean t=true;
        int rem;
      while(t)
       {
          
             rem=n%2; 
             binary=binary+rem;
          if(n==1)
              t=false;
            n=n/2;
              
            
        }

        int j=0;
        while(j<binary.length())
        	{
        		
        		if('1'==binary.charAt(j))
        			{
        				totalt++;
        			}
        		else
        			{
                       if(totalt>total)
                    	   {
                    	   total=totalt;
                    	   }
                       totalt=0;
                    }
        		j++;
        	}
        if(totalt>total)
     	   {
     	   total=totalt;
     	   }
        binary="";
        for(int j1=0;j1<total;j1++)
        	{
        		binary+="1";
        	}
        System.out.println(binary);
        
    }
}