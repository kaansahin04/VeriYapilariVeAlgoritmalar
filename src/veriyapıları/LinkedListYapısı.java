package veriyapıları;

import java.util.*;

public class LinkedListYapısı {

	public static void main(String[] args) {
		LinkedList<String> linkedL=new LinkedList<String>();
		
		linkedL.add("Erzincan");	//eleman ekleme
		linkedL.add("Gümüşhane");
		linkedL.add("İstanbul");
		linkedL.add("Çanakkale");
		
		System.out.println(linkedL);
		
		linkedL.add(3, "Hatay");	//index'e insert etme

		System.out.println(linkedL);

		System.out.println(linkedL.peek());			//baştaki eleman çekilir
		System.out.println(linkedL.peekFirst());	//baştaki eleman çekilir
		System.out.println(linkedL.peekLast());		//sondaki eleman çekilir
		
		linkedL.addFirst("Isparta");	//başa eleman ekleme
		linkedL.addLast("Ankara");		//sona eleman ekleme

		System.out.println(linkedL);
		
		linkedL.add(6, "Antalya");

		System.out.println(linkedL);
		
		linkedL.remove(4);				//index'i çıkarma
		System.out.println(linkedL);
		linkedL.remove("Antalya"); 		//elemanı çıkarma
		System.out.println(linkedL);
		linkedL.removeFirst();			//baştaki elemanı çıkarma
		System.out.println(linkedL);
		linkedL.removeLast();			//sondaki elemanı çıkarma
		System.out.println(linkedL);
		
		linkedL.contains("İstanbul");	//içeriyor mu?
		
		linkedL.isEmpty();		//uzunluk 0 mı?
		
		linkedL.indexOf("Çanakkale");	//elemanın index'ini alma
	
		linkedL.push("İstanbul");		//başa eleman ekleme
		System.out.println(linkedL);
		System.out.println(linkedL.pop());		//ilk elemanı silip çekme
		System.out.println(linkedL.pollLast());		//ilk elemanı silip çekme
		
		System.out.println(linkedL.size());		//boyutunu alma
		
		System.out.println(linkedL);
		
		linkedL.clear();	//temizleme
		
		System.out.println(linkedL);
	}

}
