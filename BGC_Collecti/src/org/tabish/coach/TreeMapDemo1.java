import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
class TreeMapDemo1 // in insertion order
	{
		public static void main(String... s1)
			{
				LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
				System.out.println(hm.size());
				System.out.println("insertion order");
				hm.put("1004", "ddd");
				hm.put("1003", "ccc");
				hm.put("1002", "bbb");
				hm.put("1001", "aaa");

				Set s = hm.entrySet();
				Iterator i = s.iterator();
				while (i.hasNext())
					{
						Map.Entry e = (Map.Entry) i.next();
						String k = (String) e.getKey();
						String v = (String) e.getValue();
						System.out.println(k + "=" + v);
					}
			}

	}