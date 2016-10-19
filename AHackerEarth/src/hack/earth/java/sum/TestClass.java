package hack.earth.java.sum;

import java.util.StringTokenizer;
import java.lang.System;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
         String line = br.readLine();
        int N = Integer.parseInt(line);
        int A[]=new int[N];
        int sum=0;
        String line1 = br.readLine();
        StringTokenizer st= new StringTokenizer(line1);
        for (int i = 0; i < N; i++) {
        	
        	A[i] = Integer.parseInt(st.nextToken());
    		 sum=sum+A[i];
        }
        System.out.println("Sum is "+sum);
    }
}