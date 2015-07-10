import java.util.HashMap;
import java.util.Map;


public class TestMap {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		Map<String,Integer> map1=new HashMap<String,Integer>();
		map1.put("男", 1);
		map1.put("女", 2);
		map1.put("160", 2);
//		map1.put("161", 3);
		Map<String,Integer> map2=new HashMap<String,Integer>();
		map2.put("男", 3);
		map2.put("女", 4);
		map2.put("165", 4);
		map2.put("166", 4);
		for (String string : map2.keySet()) {
			if(map1.containsKey(string)){
				map.put(string, map1.get(string)+map2.get(string));
			}
		}
		for (String string1 : map.keySet()) {
			if(map1.containsKey(string1)&&map2.containsKey(string1)){
				map1.remove(string1);
				map2.remove(string1);
			}
		}
		map.putAll(map1);
		map.putAll(map2);
		System.out.println(map);
	}
}
