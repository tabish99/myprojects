import java.util.ArrayList;
import java.util.Iterator;
class ArrayListGenericDemo
	{

		public static void main(String... s)
			{
				ArrayList<String> data = new ArrayList<String>();

				data.add("ssss");
				data.add("goodbye");
				// data.add(new Date());

				Iterator<String> it = data.iterator();
				while (it.hasNext())
					{
						String z = it.next();
						System.out.println(z);
					}

			}
	}