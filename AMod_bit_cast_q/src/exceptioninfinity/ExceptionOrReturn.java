package exceptioninfinity;

public class ExceptionOrReturn
	{
		public static void main(String[] args)
			{
				double r=1.0/0.0;
				System.out.println(r); // will not throw exception
				
				
				//Double.isNaN(x);
				System.out.println("Infinity vlaue +  "+Double.POSITIVE_INFINITY);
				System.out.println("Infinity vlaue +  "+Double.NEGATIVE_INFINITY);
				
				
				System.out.println(Math.min(Double.NEGATIVE_INFINITY, -0.0d));
				System.out.println(Math.min(-0.0, 0.0));
				System.out.println(Math.min(-0.0, +0.0));
				if (Math.min(-0.0,+0.0) == Math.max(0.0,+0.0))
					{
						System.out.println("ttttt");
					}
				
				int q=1/0;
				System.out.println(q); // throw exception
				
				
			}

	}
