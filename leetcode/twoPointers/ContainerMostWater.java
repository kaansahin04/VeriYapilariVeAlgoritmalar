package twoPointers;

public class ContainerMostWater {

	public static void main(String[] args) {
		int[] dizi={1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(dizi));
	}
	
	public static int maxArea(int[] dizi) {
		int enBüyükAlan=0;
		int ilk=0, son=dizi.length-1;
		
		while(ilk<son){
			int genişlik=son-ilk;
			int yükseklik=Math.min(dizi[ilk], dizi[son]);
			int alan=genişlik*yükseklik;
			enBüyükAlan=Math.max(enBüyükAlan, alan);
			
			if(dizi[ilk]<dizi[son]) {
				ilk++;
			}else {
				son--;
			}
		}
		
		return enBüyükAlan;
	}

}
