package stringVeArray;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowels {

	public static void main(String[] args) {
		String ifade="Engineering";
		String ifade2=ünlüleriDeğiştir(ifade);
		System.out.println(ifade2);
	}
	
	public static String ünlüleriDeğiştir(String ifade2) {
		char ünlüler[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		List<Character> harfler=new ArrayList<>();
		int sayac=0;
		
		for(int i=0; i<ifade2.length(); i++) {
			for(int j=0; j<ünlüler.length; j++) {
				if(ifade2.charAt(i)==ünlüler[j]) {
					harfler.add(0, ifade2.charAt(i));
					break;
				}
			}
		}
		
		for(int i=0; i<ifade2.length(); i++) {
			for(int j=0; j<ünlüler.length; j++) {
				if(ifade2.charAt(i)==ünlüler[j]) {
					if(i==0) {
						ifade2 = harfler.get(sayac).toString() + ifade2.substring(i+1, ifade2.length());
						sayac++;
						if(sayac==harfler.size()) {
							sayac=harfler.size()-1;
						}
						break;
					}else if(i==ifade2.length()){
						ifade2 = ifade2.substring(0, i) + harfler.get(sayac).toString();
						break;
					}else {
						ifade2 = ifade2.substring(0, i) + harfler.get(sayac).toString() + ifade2.substring(i+1, ifade2.length());
						sayac++;
						if(sayac==harfler.size()) {
							sayac=harfler.size()-1;
						}
						break;
					}
				}
			}
		}
		
		return ifade2;
	}

}
