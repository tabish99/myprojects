package hack.rank.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Matrix
	{

		public static void main(String[] args)throws Exception
			{
				
				int mat[][]=new int[6][6];
		
				 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				 
				 
				 for(int in=0;in<6;in++)
					{
						String line1 = br.readLine();
						StringTokenizer st = new StringTokenizer(line1);
						int k = 0;
						
						while (st.hasMoreTokens())
							{
								mat[in][k++] = Integer.parseInt(st.nextToken());
							}
					}
			    
				int max=0;
				int tmax=0;
				
				for(int r=0;r<4;r++)
					{
						for (int c = 0; c < 4; c++)
							{
								for (int i = r, a=0; i < 3 + r; i++,a++)
									{ 
										for (int j = c,b=0; j < 3 + c; j++,b++)
											{
												
												if(!(a==1 && b==0 || a==1 && b==2))
													tmax=tmax+mat[i][j];
											}
									}
								if(tmax>max)
									max=tmax;
								tmax=0;
							}
					}
				
System.out.println(max);
			}

	}