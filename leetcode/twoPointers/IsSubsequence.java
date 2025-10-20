package twoPointers;

public class IsSubsequence {

	public static void main(String[] args) {
		String ifade="dlk";
		String ifade2="gdaolwsk";
		System.out.println(isSubsequence(ifade, ifade2));
	}

	public static boolean isSubsequence(String ifade, String ifade2) {
		int harf1=0, harf2=0;
		while(harf1<ifade.length() && harf2<ifade2.length()) {
			if(ifade.charAt(harf1) == ifade2.charAt(harf2)) {
				harf1++;
			}
			harf2++;
		}
		return harf1==ifade.length();
	}
	
}
