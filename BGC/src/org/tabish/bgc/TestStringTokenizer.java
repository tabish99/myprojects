package org.tabish.bgc;

import java.util.StringTokenizer;

public class TestStringTokenizer
	{

		/**
		 * @param args
		 */
		public static void main(String[] args)
			{
				StringTokenizer st = new StringTokenizer("Auto-generated method stub 4WD");
				
				while(st.hasMoreElements())
					{
						String s = st.nextToken();
						System.out.println("--"+s);
					}

			}

	}
