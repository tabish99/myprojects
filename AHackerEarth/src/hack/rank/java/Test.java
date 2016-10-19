package hack.rank.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test
	{


		static Integer maxrow = new Integer(0);

		public static void main(String[] args)throws Exception
			{
				/*
				 * Enter your code here. Read input from STDIN. Print output to
				 * STDOUT. Your class should be named Solution.
				 */

				BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Who_Is_Stopping_You\\Desktop\\Hackerearth\\hackerrank\\fileinpu output\\teamformation.txt"));
				int n = Integer.parseInt(br.readLine());
				String line[]=new String[n];
				for (int l = 0; l < n; l++)
					{
			        line[l] = br.readLine();
			       // System.out.println(line[l]);
					}
				
				for (int l = 0; l < n; l++)
					{
						maxrow=0;
						Integer m[][] = new Integer[100000][3];
						
					        StringTokenizer st= new StringTokenizer(line[l]);
                            int noOfElement= Integer.parseInt(st.nextToken());
                            int min;
                            if(noOfElement==0)
                            	{
                            		 min=0;
                            	}	
                            else
                            	{
                            		 min = 999999;
                            	}
                            
                        int number = 0;
						while (st.hasMoreTokens())
							{
								number = Integer.parseInt(st.nextToken());
								int i = 0;
								do
									{

										if (m[i][0] == m[i][1]
										        && m[i][0] == null)
											{

												m[i][0] = number;
												m[i][2] = 1;
												maxrow += 1;
												i++;
											} else
											{
												if (m[i][0] - 1 == number
												        && m[i][1] == null)
													{
														m[i][1] = m[i][0];
														m[i][0] = number;
														m[i][2] = m[i][2] + 1;
														break;
													} else if (m[i][0] + 1 == number
												        && m[i][1] == null)
													{
														m[i][1] = number;
														m[i][2] = m[i][2] + 1;
														break;
													} else if (m[i][0] - 1 == number
												        && m[i][1] != null)
													{
														m[i][0] = number;
														m[i][2] = m[i][2] + 1;
														mergeContinue(m,
														        number, i);
														break;
													} else if (m[i][1] != null
												        && m[i][1] + 1 == number)
													{
														m[i][1] = number;
														m[i][2] = m[i][2] + 1;
														mergeContinue2(m,
														        number, i);
														break;
													} else if (m[i + 1][0] == m[i + 1][1]
												        && m[i + 1][0] == null)
													{
														m[i + 1][0] = number;
														m[i + 1][2] = 1;
														maxrow += 1;
														i++;
													}
											}
										i = i + 1;

									} while (i < maxrow);
								
								
							}
						
						
						int a=0,b=0;
						
						while(a<maxrow)
							{
								b=a+1;
								while(b<maxrow)
									{

											if(null!=m[a][1] && null!=m[b][0] &&  m[a][1]+1==m[b][0] )//+ve+1 incr
												{
													if(m[b][1]==null)
														{
															m[a][1]=m[b][0];
															m[a][2]+=1;
															
															m[b][2]=null;
															m[b][0]=null;
														}
													else
														{
															m[a][1]=m[b][1];
															m[a][2]+=m[b][2];
															
															m[b][2]=null;
															m[b][1]=null;
															m[b][0]=null;
														}
												}
											else if(null!=m[b][1] && null!=m[a][0] &&  m[b][1]+1==m[a][0] )//+ve+1 dcre
												{
													if(m[a][1]==null)
														{
															m[b][1]=m[a][0];
															m[b][2]+=1;
															
															m[a][2]=null;
															m[a][0]=null;
														}
													else
														{
															m[b][1]=m[a][1];
															if(null!=m[b][2])
																{
															 m[b][2]+=m[a][2];
																}
															 else
																{
																	 m[b][2]=m[a][2];
																}
															
															m[a][2]=null;
															m[a][1]=null;
															m[a][0]=null;
														}
											
												}
											else if(null!=m[b][0] && null!=m[b][1] && m[b][0]==m[a][1]) // same incr
												{
													m[a][1]=m[b][1];
													
													m[b][1]=null;
													m[a][2]+=m[b][2]-1;
													m[b][2]=1;
												}
											else if(null!=m[a][0] && null!=m[a][1] && m[a][0]==m[b][1]) // same dcrm
												{
													m[b][1]=m[a][1];
													
													m[a][1]=null;
													m[b][2]+=m[a][2]-1;
													m[a][2]=1;
												}
											else if(null!=m[a][0] && null!=m[b][0] && (m[a][0]+1)==m[b][0]) // same side decr
												{
													
													if(m[b][1]==null)
														{
															m[b][1]=m[a][1];
															
															m[a][1]=null;
															m[a][0]=null;
															m[a][2]=null;
															m[b][2]=m[a][2];
														}
													else
														{ if(null!=m[a][1])
															{
																m[a][0]-=1;
																m[a][2]+=1;
																m[b][0]+=1;
																m[b][2]-=1;
																
															}
															
														}
												}
											b++;	
									 }a++;
							}

						
						for (int i = 0; i < maxrow; i++)
							{
								//System.out.println(m[i][0] + "  " + m[i][1] + "  " + m[i][2]);
								if ( null!= m[i][2]  && m[i][2] < min)
									{
									min = m[i][2];
									}
							}
						System.out.println(min);
						//System.out.println(min + " " + maxrow);
					}

			}

		private static void mergeContinue(Integer m[][], int number, int i)
			{/*

				int k = 0;

				while (k < maxrow)
					{

						if (null != m[k][0] && number == (m[k][0] + 1)
						        && m[k][1] == null)                         // (5 ,null)
							{

								m[i][0] = m[k][0];
								m[i][2] += 1;

								m[k][0] = null;
								m[k][2] = null;
								maxrow--;
								break;
							} else if (null != m[k][1] && (number == m[k][1] + 1))          //4  (2,3 )
							{
								m[i][0] = m[k][0];
								m[i][2] += m[k][2];

								m[k][0] = null;
								m[k][1] = null;
								m[k][2] = null;
								maxrow--;
							}
						k++;
					}
			*/}
		private static void mergeContinue2(Integer m[][], int number, int i)
			{/*

				int k = 0;

				while (k < maxrow)
					{

						if (null != m[k][0] && number == (m[k][0] -1) )       // (5 ,null)
							{

								m[i][1] = m[k][1];
								m[i][2] += m[k][2];

								m[k][0] = null;
								m[k][1]=null;	
								m[k][2] = null;
								maxrow--;
								break;
							} else if (null != m[k][1] && number == m[k][1] + 1)          //4  (2,3 )
							{
								m[i][0] = m[k][0];
								m[i][2] += m[k][2];

								m[k][0] = null;
								m[k][1] = null;
								m[k][2] = null;
								maxrow--;
							}
						k++;
					}
			*/}
	}