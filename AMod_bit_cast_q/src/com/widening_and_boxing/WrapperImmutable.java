package com.widening_and_boxing;

public class WrapperImmutable
	{

		public static void main(String[] args)
			{

				Boolean b=new Boolean(true);
				System.out.println("object b :"+b.hashCode());
				b=false;
				System.out.println("object b :"+b.hashCode());
				//hashcode is different
				//wrapper classes are immutable once they have been given a value it can not be vchanged
Boolean b1 = new Boolean("");
System.out.println("boolean :"+b1);  // by default false

Integer i1=128;
Integer i2=128;
if(i1==i2)  //false
System.out.println(i1.hashCode()+" "+i2.hashCode()); 
}

	}
