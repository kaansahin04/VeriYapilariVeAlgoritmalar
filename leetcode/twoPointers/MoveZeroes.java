package twoPointers;

public class MoveZeroes {

	public static void main(String[] args) {
		int dizi[] = {0,12,3,0,6};
		moveZeroes(dizi);
	}

	public static void moveZeroes(int[] dizi) {
		int sıfırDeğil=0;
		for(int i=0; i<dizi.length; i++) {
			if(dizi[i]!=0) {
				int temp=dizi[sıfırDeğil];
				dizi[sıfırDeğil]=dizi[i];
				dizi[i]=temp;
				
				sıfırDeğil++;
			}
		}
		for(int i:dizi) {
			System.out.print(i+" ");
		}
	}

}
