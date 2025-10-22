package algoritmalar;

public class SlidingWindow {

	public static void main(String[] args) {
		int dizi[] = {2, 5, -2, 0, 36, 18};
		int adet = 3;
		System.out.println(slideWindow(dizi, adet));
	}
	
	public static int slideWindow(int[] dizi, int adet) {
		int toplam=0;
		int pencere=0;
		
		for(int i=0; i<adet; i++) {
			pencere+=dizi[i];
		}
		toplam=pencere;
		
		for(int i=0; i<dizi.length-adet; i++) {
			pencere = pencere - dizi[i] + dizi[i+adet];
			toplam=Math.max(pencere, toplam);
		}
		
		return toplam;
	}

}
