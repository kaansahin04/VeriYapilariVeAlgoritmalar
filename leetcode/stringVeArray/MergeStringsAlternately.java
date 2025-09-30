package stringVeArray;

public class MergeStringsAlternately {

	public static void main(String[] args) {
		String kelime1="abc";
		String kelime2="defgh";
		String sonuç=birleştir(kelime1, kelime2);
		System.out.println(sonuç);
	}
	
	public static String birleştir(String kelime1, String kelime2) {
		String sonuç="";											//O(1)
		int enUzun=Math.max(kelime1.length(), kelime2.length());	//O(1)
		
		for(int i=0; i<enUzun; i++) {										//O(m + n) --> 5+3 = 8 --> Zaman Karmaşıklığı
																	//			^   ^
			if(i<kelime1.length()) {								//O(m) -----|   |
				sonuç+=kelime1.charAt(i);							//				|
			}														//				|			
			if(i<kelime2.length()) {								//O(n) ---------|
				sonuç+=kelime2.charAt(i);
			}
		}
		
		return sonuç;
	}
	
}
