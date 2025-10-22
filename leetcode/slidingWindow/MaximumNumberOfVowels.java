package slidingWindow;

public class MaximumNumberOfVowels {

	public static void main(String[] args) {
		String ifade="YediripYedirmim";
		String ifade2="Zozurtmim";
		String ifade3="ZMz";
		int adet=3;
		System.out.println(maxVowels(ifade,adet));
		System.out.println(maxVowels(ifade2,adet));
		System.out.println(maxVowels(ifade3,adet));
	}
	
	public static int maxVowels(String ifade, int adet) {
		String sesliHarfler="AEIİOUaeıiou";
		int toplam=0;
		int anlık=0;
		
		for(int i=0; i<adet; i++) {
			if(sesliHarfler.contains(String.valueOf(ifade.charAt(i)))) {
				anlık+=1;
			}
		}
		toplam=anlık;
		
		for(int i=adet; i<ifade.length(); i++) {
			if(sesliHarfler.contains(String.valueOf(ifade.charAt(i)))) {
				anlık+=1;
			}
			if(sesliHarfler.contains(String.valueOf(ifade.charAt(i-adet)))) {
				anlık-=1;
			}
			toplam=Math.max(toplam, anlık);
		}
		
		return toplam;
	}
	
}
