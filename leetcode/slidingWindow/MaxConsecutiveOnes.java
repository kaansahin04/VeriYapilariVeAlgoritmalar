package slidingWindow;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int dizi[] = {0,1,0,1,0,0,0,0,1,0,1,1,0,1,0,0,1,0,1};
		int adet=4;
		System.out.println(longestOnes(dizi, adet));
	}
	
	public static int longestOnes(int[] dizi, int adet) {
		int toplam=0;
		int sol=0;
		for(int sağ=0; sağ<dizi.length; sağ++) {
			if(dizi[sağ]==0) {
				adet-=1;
			}
			if(adet<0) {
				if(dizi[sol]==0) {
					adet+=1;
				}
				sol+=1;
			}
			toplam=Math.max(toplam, sağ-sol+1);
		}
		
		return toplam;
	}

}
