package twoPointers;

import java.util.Arrays;

public class MaxNumberKSumPairs {

	public static void main(String[] args) {
		int[] dizi = {1,2,3,4,5};
		int hedef=5;
		System.out.println(işlemSayısı(dizi, hedef));
	}
	
	public static int işlemSayısı(int[] dizi, int hedef) {
		Arrays.sort(dizi);
		
		int kaçİşlem=0;
		int ilk=0, son=dizi.length-1;
		int toplam=0;
		
		while(ilk<son) {
			toplam=dizi[ilk]+dizi[son];
			if(toplam==hedef) {
				kaçİşlem++;
				ilk++;
				son--;
			}else if(toplam<hedef) {
				ilk++;
			}else {
				son--;
			}
		}
		
		return kaçİşlem;
	}

}
