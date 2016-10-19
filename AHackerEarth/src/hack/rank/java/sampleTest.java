package hack.rank.java;

import java.util.Scanner;


public class sampleTest {
   static  int fact=1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       int n = scan.nextInt();
       
       System.out.println(factorial(n));
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    
    public static int factorial (int n)
        {
        	
        	if(n!=1)
           fact=n*factorial(n-1);
           return fact;
        }
}
