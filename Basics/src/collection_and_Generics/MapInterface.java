package collection_and_Generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
 * Map stores the values in key-Value pair.
 * Here we have put method to add elements.
 * When we assign value that already exists, then original value is overridden with new.
 * We cant have same key with different values, But we can have different keys with same val.
 * HashTable is synchronized where HashMap is not.
 */
public class MapInterface {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		map.put("my_name", "Vaibhav");
		map.put("degree", "BE");
		map.put("profession", "Software Engineer");
		map.put("my_name","Kiran"); //Original value gets overridden.
		
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		
		for(String key:keys) {
			System.out.println(map.get(key));
		}
	}

}
