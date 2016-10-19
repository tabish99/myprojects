package org.tabish.bgc;

public class MutableImmutable
	{

		public static void main(String[] args)
			{

				String immutable="hello";
				String immutable1="hello1";
				
				StringBuffer mutable=new StringBuffer("mutable");
				StringBuffer mutable1=new StringBuffer("mutable1");
				
				String immuteProxy=immutable;
				immutable=immutable.concat("ok");
				if(!(immutable==immuteProxy))
						System.out.println("not same hence immutable "+immutable);
				
				StringBuffer mutableproxy=mutable;
				mutable.append("ok");
				if(mutable==mutableproxy)
					{
						System.out.println(mutable+" .."+mutableproxy);
					System.out.println("same hence mutable");
					}
			}

	}
