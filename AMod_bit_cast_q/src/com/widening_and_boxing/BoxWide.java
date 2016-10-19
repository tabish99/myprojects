package com.widening_and_boxing;

public class BoxWide
	{
		public static void main(String... s)
			{
				byte b = 1;
				boxnWideViaObject(b);
			}

		static void boxnWideViaObject(Object obj)
			{
				System.out.println(obj.toString());
					
				Byte b=	(Byte)obj;    // make sure u r casting(narrowing) with the right object.
				
				//byte b1=(byte)obj;  //error
				
				
				
				System.out.println("narrowing via object...  "+b);
			}
		static void boxnWideViaObject(Byte obj)
			{
				System.out.println("narrowi "+obj);
			}
		
				
				
				
	}
