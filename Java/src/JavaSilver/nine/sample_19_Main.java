package JavaSilver.nine;

import java.util.HashMap;
import java.util.Map;

public class sample_19_Main {

	public static void main(String[] args) {
		Map<Integer, sample_19> map = new HashMap<Integer, sample_19>();
		map.put(1, new sample_19(1, "A"));
		map.put(2,  new sample_19(2, "B"));
		map.put(3 , new sample_19(3, "C"));
		map.put(1, new sample_19(11, "AA"));
		map.put(null, new sample_19(0, "dagault"));
		map.put(55, new sample_19(999, "999"));
		
		System.out.println(map.size());
		System.out.println(map);
		
		for (Integer key : map.keySet()) {
			System.out.println(map.get(key));
		}

	}

}
