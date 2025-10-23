package veriyapıları;

import java.util.Stack;

public class StackYapısı {

	public static void main(String[] args) {
		Stack<String> yığıt=new Stack<>();
		
		yığıt.add("Kaan");	//eleman ekleme
		yığıt.add("Bilgisayar");
		yığıt.add("Mühendislik");
		System.out.println(yığıt);
		
		System.out.println(yığıt.pop());	//en üstteki elemanı silip döndürme
		System.out.println(yığıt);

		System.out.println(yığıt.peek());	//en üstteki elemanı silmeden döndürme
		System.out.println(yığıt);
		
		System.out.println(yığıt.contains("K"));	//içeriyor mu?
		
		System.out.println(yığıt.isEmpty());	//uzunluk 0 mı?
		
		System.out.println(yığıt.get(0));	//index'teki elemanı getirme
		System.out.println(yığıt.getFirst());	//ilk elemanı getirme
		System.out.println(yığıt.getLast());	//son elemanı getirme

		System.out.println(yığıt.search("Kaan"));	//elemanın en üste olan uzaklığını alma (en üstteki için değer 1'dir)
		
		yığıt.set(1, "Erzincan");	//index'teki elemanı değiştirme
		System.out.println(yığıt);
		yığıt.insertElementAt("24", 1);		//index'e eleman sıkıştırma (sonrakiler kayar)
		System.out.println(yığıt);
		
		System.out.println(yığıt.search("Kaan"));
		
		System.out.println(yığıt.size());	//boyutunu alma

		yığıt.remove(2);	//index'teki elemanı silme
		System.out.println(yığıt);
		yığıt.remove("24");		//elemanı silme
		System.out.println(yığıt);
		
		yığıt.clear();	//temizleme
		System.out.println(yığıt);
	}

}
