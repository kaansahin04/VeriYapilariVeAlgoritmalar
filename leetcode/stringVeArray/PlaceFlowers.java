package stringVeArray;

public class PlaceFlowers {

	public static void main(String[] args) {
		int flowerbed[] = {1,0,0,1,0,0,0,0,1,0,1,1,0,0,0,1};
		int n=2;
		System.out.println(ekilir(flowerbed, n));
	}
	
	public static boolean ekilir(int[] flowerbed, int n) {
		int sayac=0;
		int uzunluk=flowerbed.length;
		
		if(flowerbed.length==1) {
			if(flowerbed[0]==0) {
				sayac++;
				flowerbed[0]=1;
			}
		}else {
			for(int i=0; i<uzunluk; i++) {
				if(i==0) {
					if(flowerbed[i]==0 && flowerbed[i+1]==0) {
						sayac++;
						flowerbed[i]=1;
					}
				}else if(i==uzunluk-1) {
					if(flowerbed[uzunluk-1]==0 && flowerbed[uzunluk-2]==0){
						sayac++;
						flowerbed[i]=1;
					}
				}else {
					if(flowerbed[i-1]==0 && flowerbed[i]==0 && flowerbed[i+1]==0) {
						sayac++;
						flowerbed[i]=1;
					}
				}
			}
		}
		
		if(sayac>=n) {
			return true;
		}else {
			return false;
		}
	}

}
