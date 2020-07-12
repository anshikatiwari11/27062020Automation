package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
		Set<String> set= new LinkedHashSet<>();
		set.add("Puja");
		set.add("Anshika");
		set.add("Aanchal");
		set.add("Anshika");
		/*for(String s:set)
		{
			System.out.println(s);
		}*/
		Iterator<String> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
