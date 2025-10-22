package hashMapSet;

import java.util.Arrays;

public class DetermineCloseStrings {

	public static void main(String[] args) {
		String ifade="cabbba", ifade2="abbccc";
		System.out.println(closeStrings(ifade, ifade2));
	}
	
	public static boolean closeStrings(String ifade, String ifade2) {
		if(ifade.length()!=ifade2.length()) {
			return false;
		}
		
		int frekans[]=new int[31];
		int frekans2[]=new int[31];
		for(char ch:ifade.toCharArray()) {
			frekans[ch-'a']++;
		}
		for(char ch:ifade2.toCharArray()) {
			frekans2[ch-'a']++;
		}
		
		for(int i=0; i<31; i++) {
			if((frekans[i]==0 && frekans2[i]!=0) ||
			   (frekans[i]!=0 && frekans2[i]==0)) {
					return false;
			}
		}
		
		Arrays.sort(frekans);
		Arrays.sort(frekans2);
		
		return Arrays.equals(frekans, frekans2);
	}

}
