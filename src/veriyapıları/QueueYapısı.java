package veriyapıları;

import java.util.*;

public class QueueYapısı {

	public static void main(String[] args) {
		Queue<Integer> kuyruk=new LinkedList<>();
		
		kuyruk.add(35);		//eleman ekleme
		kuyruk.add(55);
		kuyruk.add(85);
		
		System.out.println(kuyruk.isEmpty());	//boş mu?
		
		System.out.println(kuyruk.poll());		//ilk elemanı silip verir
		
		System.out.println(kuyruk.peek());		//ilk elemanı silmeden verir
		
		System.out.println(kuyruk.contains(55));	//içeriyor mu?
		
		kuyruk.remove(55);		//eleman silme
		
		System.out.println(kuyruk.size());		//boyutunu alma
		
		kuyruk.clear();		//temizleme
		
		System.out.println(kuyruk.isEmpty());
	}

}
