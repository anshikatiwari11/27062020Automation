package collection;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		Map<String, String> map= new HashMap<>();
		
		map.put("name", "Anshika");
		map.put("email", "anshikatiwari11@gmail.com");
		map.put(null, "absgdgxb");
		
		System.out.println(map.get("name"));
		System.out.println(map.get("email"));
		System.out.println(map.get(null));
				
	}

}
