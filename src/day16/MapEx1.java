package day16;

import java.util.*;

public class MapEx1 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("abcde", "1234");
		map.put("abcde", "12345");
		map.put("abcdef", "1234");
	
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("id : " + e.getKey());
			System.out.println("pw : " + e.getValue());
			System.out.println("======================");
		}
		Set keySet = map.keySet();					// 중복되지 않아서 Set
		Collection valueSet = map.values();		
	}
}

