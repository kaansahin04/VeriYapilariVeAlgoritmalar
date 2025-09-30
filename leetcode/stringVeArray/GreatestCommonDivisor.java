package stringVeArray;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		String kelime1="ABABAB";
		String kelime2="ABAB";
		String sonuç2=ebob(kelime1, kelime2);
		System.out.println(sonuç2);
	}

	public static String ebob(String kelime1, String kelime2) {
		String sonuç2="";																//O(1)
		int ebob=1;																		//O(1)
		
		if(!(kelime1+kelime2).equals(kelime2+kelime1)) {								//O(m + n) --> 6+4 = 10 --> Zaman Karmaşıklığı
			return "";
		}else {
			for (int i=1; i<=Math.min(kelime1.length(), kelime2.length()); i++) {		//O( min(m,n) ) --> min(6,4) = 4
				if(kelime1.length() % i == 0 && kelime2.length() % i ==0) {
					ebob=i;
				}
			}
			sonuç2=(kelime1+kelime2).substring(0, ebob);								//O(ebob)
			return sonuç2;
		}
	}
	
}
