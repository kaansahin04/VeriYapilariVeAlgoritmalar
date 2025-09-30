package stringVeArray;

import java.util.ArrayList;
import java.util.List;

public class KidsCandies {
	public static void main(String[] args) {
		Integer dizi[] = {5, 3, 2, 4, 3};
		int ekstraŞeker=2;
		
		System.out.println(şeker(dizi, ekstraŞeker));
	}
	
	public static List<Boolean> şeker(Integer[] dizi, int ekstraŞeker){
		int enÇok=0;
		for(int i : dizi) {
			if(i>enÇok) {
				enÇok=i;
			}
		}
		
		List<Boolean> sonuç=new ArrayList<>();
		for(int şeker : dizi) {
			sonuç.add(şeker + ekstraŞeker >= enÇok);
		}
		
		return sonuç;
	}
}
