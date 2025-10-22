package hashMapSet;

import java.util.*;

public class UniqueOccurrences {

	public static void main(String[] args) {
		int[] dizi = {1,2,2,1,1,3};
		System.out.println(unique(dizi));
	}
	
	public static boolean unique(int[] dizi) {
		if(dizi.length==0) {
			return false;
		}
		
		Map<Integer, Integer> map=new HashMap<>();
		for(int sayı:dizi) {
			if(map.containsKey(sayı)) {
				map.put(sayı, map.get(sayı)+1);
			}else {
				map.put(sayı, 1);
			}
		}
		
		Set<Integer> set=new HashSet<>(map.values());
		if(map.size()==set.size()) {
			return true;
		}
		
		return false;
	}

}
