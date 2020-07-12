package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		List<String> list= new Vector<>();
		list.add("Puja");
		list.add("Anshika");
		list.add("Anshika");
		list.add("Anshika");
		list.add("Nitu");
		for(String s:list)
		{
			System.out.println(s);
		}

	}

}
