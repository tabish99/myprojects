package practice;
//Complete this code or write your own from scratch
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

class Solution{
  public static void main(String []argh) throws Exception {
      
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           StringTokenizer st ;  
           String name;
           int phone;
          String str;
          Map<String,Integer> map= new HashMap<String,Integer>();
          int n=Integer.parseInt(br.readLine());
      for(int i = 0; i < n; i++){
           
           str = br.readLine();
          st =new StringTokenizer(str);
           name= st.nextToken();
           phone= Integer.parseInt(st.nextToken()); 
          map.put(name,phone);
          
          // Write code here
      }
      List list= new ArrayList();
      while(null!= (str=br.readLine()))
          {
            list.add(str);
          }
          for(Object inp:list)
          {  
        	  String a=(String)inp;
            if( null != map.get(a))
             {
                System.out.println(inp+" = "+map.get(a));
            }
          }
  }
}
