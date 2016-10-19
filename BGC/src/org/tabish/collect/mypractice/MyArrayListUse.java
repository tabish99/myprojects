package org.tabish.collect.mypractice;

import java.util.Iterator;

public class MyArrayListUse
	{

		/**
		 * @param args
		 */
		public static void main(String[] args)
			{
				MyArrayList<String> al1=new MyArrayList<String>(12);

						al1.add("a");
						al1.add("a");
						al1.add("b");
					Iterator<String> itr =	al1.iterator();
								while(itr.hasNext())
									{
										System.out.println(itr.next());
									}
					
			
			}

	}
