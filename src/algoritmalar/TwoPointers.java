package algoritmalar;

import java.util.Arrays;

public class TwoPointers {

	public static void main(String[] args) {
		int[] dizi={10,55,20,94,35};
		int hedef=85;
		System.out.println(twoPointer(dizi, hedef));
	}

	public static boolean twoPointer(int[] dizi, int hedef) {
		Arrays.sort(dizi);
		int ilk=0, son=dizi.length-1;
		
		while(ilk<son) {
			int toplam=dizi[ilk]+dizi[son];
			if(toplam==hedef) {
				return true;
			}else if(toplam<hedef) {
				ilk++;
			}else {
				son--;
			}
		}
		return false;
	}

}
