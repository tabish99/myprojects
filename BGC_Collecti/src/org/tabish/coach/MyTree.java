import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
class MyTree
	{
		public static void main(String... s)
			{
				Comparator m = new MyComp();
				TreeSet t = new TreeSet(m);
				t.add(new Temp(10));
				t.add(new Temp(5));
				t.add(new Temp(1));
				t.add(new Temp(3));
				t.add(new Temp(2));
				t.add(new Temp(4));

				Iterator i = t.iterator();
				while (i.hasNext())
					{
						Temp t1 = (Temp) i.next();
						System.out.println(t1.salary);
					}
			}
	}