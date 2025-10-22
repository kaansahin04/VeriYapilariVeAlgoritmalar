package hashMapSet;

import java.util.*;

public class FindDifferenceArrays {

	public static void main(String[] args) {
		int[] dizi = {1,2,3};
		int[] dizi2 = {2,4,6};
		System.out.println(Arrays.asList(findDifference(dizi, dizi2), findDifference(dizi2, dizi)));
	}
	
	public static List<Integer> findDifference(int[] dizi, int[] dizi2){
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		
		for(int sayı:dizi2) {
			set2.add(sayı);
		}
		
		for(int sayı:dizi) {
			if(!set2.contains(sayı)) {
				set1.add(sayı);
			}
		}
		
		return new ArrayList<Integer>(set1);
	}

}
