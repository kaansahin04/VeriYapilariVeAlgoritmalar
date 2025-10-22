package slidingWindow;

public class MaximumAverageSubarray {

	public static void main(String[] args) {
		int dizi[] = {1,12,-5,-6,50,3};
		int adet=4;
		System.out.println(maxAverage(dizi,adet));
	}
	
	public static double maxAverage(int[] dizi, int adet) {
		int anlık=0;
		double toplam=0;
		
		for(int i=0; i<adet; i++) {
			anlık+=dizi[i];
		}
		toplam=anlık;
		
		for(int i=adet; i<dizi.length; i++) {
			anlık += dizi[i] - dizi[i-adet];
			toplam=Math.max(toplam, anlık);
		}
			
		return toplam/adet;
	}

}
