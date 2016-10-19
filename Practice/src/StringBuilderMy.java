
public class StringBuilderMy
	{

		public static void main(String...s)
			{
				
				StringBuffer sb=new StringBuffer("hello");
				StringBuffer b2=sb;
				System.out.println(sb);
				sb.append(5);
				System.out.println(b2);
				System.out.println(sb);
				
				
			}
		
		
	}
