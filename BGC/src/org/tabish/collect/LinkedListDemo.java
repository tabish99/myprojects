package org.tabish.collect;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class LinkedListDemo
	{
		public static void main(String[] args)
			{
				LinkedList<String> ll = new LinkedList<String>();
				ll.add("11");
				ll.add("2");
				ll.addAll(Arrays.asList("15", "34","34", "12", "35", "32"));
				System.out.println(ll);
				ll.push("20");
				System.out.println(ll);
				ll.addFirst("30");
				System.out.println(ll);
				ll.offerFirst("40");
				System.out.println(ll);

				// remove 4th element

				ListIterator<String> li = ll.listIterator();
				for (int i = 1; li.hasNext(); i++)
					{
						li.next();

						if (i == 4)
							{
								li.remove();
								break;
							}
					}
				System.out.println(ll);
				//remove 2nd last element
				Iterator<String> id = ll.descendingIterator();
				for (int i = 1; id.hasNext(); i++)
					{
						id.next();

						if (i == 2)
							{
								id.remove();
								System.out.println("  remove");
								break;
							}
					}
				System.out.println(ll);
				
				Set<String> s = new LinkedHashSet<String>(ll);
				System.out.println("set " +  s);
				
				Set<String> s1 = new TreeSet(ll);
				System.out.println("treeset " +  s1);
				Set<String> s2 = new TreeSet<String>(new ComparatorStringNumValue());
				s1.addAll(ll);
				System.out.println("treeset " +  s2);
				
				Collections.sort(ll);
				System.out.println("sort");
				System.out.println(ll);
				Collections.sort(ll, new ComparatorStringNumValue());
				System.out.println(ll);
				
				
			}
		
	private static class ComparatorStringNumValue implements Comparator<String>
	{
		@Override
		public int compare(String o1, String o2)
		    {
		       return Integer.valueOf(o1).compareTo(Integer.valueOf(o2));
		       
		    }
	}
		
	}
