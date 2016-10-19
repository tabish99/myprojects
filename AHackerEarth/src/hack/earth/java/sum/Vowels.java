package hack.earth.java.sum;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Vowels {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        char c[]=line.toCharArray();
        int n=0;
        for (int i = 0; i < c.length; i++) {
           if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
           {
           	n=n+1;
           }
          System.out.println(n);
        }
        
    }
}