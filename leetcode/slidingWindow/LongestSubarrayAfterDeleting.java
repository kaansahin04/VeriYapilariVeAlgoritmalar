package slidingWindow;

public class LongestSubarrayAfterDeleting {

	public static void main(String[] args) {
		int[] dizi = {0,1,1,1,0,1,1,0,1};
		System.out.println(deleteElement(dizi));
	}
	
	public static int deleteElement(int[] dizi) {
		int sol=0, sağ=0;
		int enUzun=0;
		int silinecek=-1;
		
		for(sağ=0; sağ<dizi.length; sağ++) {
			if(dizi[sağ]==0) {
				enUzun=Math.max(enUzun, sağ-sol-1);
				sol=silinecek+1;
				silinecek=sağ;
			}
			if(sağ==dizi.length-1) {
				enUzun=Math.max(enUzun, sağ-sol);
			}
		}
		
		return enUzun;
	}

}
