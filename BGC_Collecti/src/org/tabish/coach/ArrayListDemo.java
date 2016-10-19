package org.tabish.coach;

import java.util.ArrayList;


class ArrayListDemo
	{
		public static void main(String... s)
			{ // <String>
				ArrayList<String> al = new ArrayList<String>();
				System.out.println(al.size());
				al.add("d");
				al.add("b");
				al.add("d");
				al.add("b");
				// al.add(new Integer(10));

				System.out.println(al.size());
				al.remove(2);

				System.out.println(al.size());
				System.out.println(al); // toString override
			}
	}