package veriyapıları;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVeri {

	public static void main(String[] args) {
		Integer dizi[] = {3, 4, 5, 5, 3, 9};
		Arrays.sort(dizi);		//dizi elemanları küçükten büyüğe sıralanır
		Arrays.binarySearch(dizi, 4);	//dizide eleman index'i bulma
		List<Integer> liste=new ArrayList<Integer>(Arrays.asList(dizi));	//diziyi list yapısına getirme
		System.out.println(liste);
		
		liste.add(24);	//listeye eleman ekleme
		liste.add(34);
		liste.set(7, 10);	//index'teki sayı değiştirme
		System.out.println(liste);
		
		System.out.println(liste.get(5));	//index'teki elemanı getirme
		liste.remove(3);	//index'teki elemanı silme
		System.out.println(liste);
		
		System.out.println(liste.indexOf(9));	//elemanın index'ini verme
		liste.sort((z,a) -> a.compareTo(z));	//liste elemanları büyükten küçüğe sıralanır
		System.out.println(liste);
		
		System.out.println(liste.size());	//listenin boyutunu alma
		System.out.println(liste.contains(34));		//eleman listede var mı
		
		liste.clear();	//liste temizleme
		System.out.println(liste);
	}
	
}
