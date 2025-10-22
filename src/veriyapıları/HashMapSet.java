package veriyapıları;

import java.util.*;

public class HashMapSet {

	public static void main(String[] args) {
		Set<Integer> set1=new HashSet<>();
		set1.add(35);	//eleman ekleme
		set1.add(55);
		
		System.out.println(set1.contains(20));	//içeriyor mu?
		
		System.out.println(set1.isEmpty());		//uzunluk 0 mı
		
		set1.remove(55);	//eleman silme
		
		System.out.println(set1.size());	//boyutunu alma
		
		System.out.println(set1);
		
		set1.clear();	//temizleme
		
		System.out.println(set1);
	}

}
