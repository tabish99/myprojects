package hack.earth.java.sum;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Modulo {
	public static void main(String...s) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        double l=1l;
        double l1=10000000000l;
        int N = Integer.parseInt(line);
        int A[]=new int[N];
        String line2 = br.readLine();
        StringTokenizer st=new StringTokenizer(line2);
        double mod;
        int j=-1;
        for (int i = 0; i < N; i++) {
        	A[i]=Integer.parseInt(st.nextToken());
           l=(l*A[i])%1000000007;
        }
        System.out.println(l);
        
    }
}
