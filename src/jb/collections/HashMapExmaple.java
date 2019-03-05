package jb.collections;
import java.util.HashMap;
import java.util.Map.Entry;
public class HashMapExmaple {

	public static void main(String[] args) {
		HashMap<String, String> countryToCapitalMap = new HashMap<String, String>();
		
		countryToCapitalMap.put("Israel", "Jerusalem");
		countryToCapitalMap.put("France", "Paris");
		countryToCapitalMap.put("UK", "London");
		countryToCapitalMap.put("Italy", "Rome");
		
		String israelsCapital = countryToCapitalMap.get("Israel");
		System.out.println(israelsCapital);

		for (Entry<String, String> entry : countryToCapitalMap.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
			
		}
		System.out.println("-------------");
		
		HashMap<Integer, String> idToPersonNameMap = new HashMap<Integer, String>();
		idToPersonNameMap.put(1234, "Moshe");
		idToPersonNameMap.put(2233, "Yossi");
		idToPersonNameMap.put(1122, "Yael");
		idToPersonNameMap.put(1134, "Shimon");
	
		String name = idToPersonNameMap.get(1122);
		System.out.println(name);
	}
}
/*
UK --> London
Italy --> Rome
Israel --> Jerusalem
France --> Paris
-------------
Yael
*/