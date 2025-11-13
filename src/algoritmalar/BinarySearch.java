package algoritmalar;

public class BinarySearch {

	public static void main(String[] args) {
		int dizi[] = {1,5,7,9,15,24,35,67};
		
		System.out.println(binarySearch(dizi, 0, dizi.length-1, 15));
		System.out.println(binarySearch(dizi, 0, dizi.length-1, 35));
		System.out.println(binarySearch(dizi, 0, dizi.length-1, 5));
		System.out.println(binarySearch(dizi, 0, dizi.length-1, 10));
		System.out.println(binarySearch(dizi, 0, dizi.length-1, 67));
	}
	
	private static int binarySearch(int[] dizi, int baş, int son, int değer) {
		if(son<baş) {
			return -1;
		}
		
		int orta=(baş+son)/2;
		if(dizi[orta]==değer) {
			return orta;
		}else if(dizi[orta]<değer) {
			return binarySearch(dizi, orta+1, son, değer);
		}else {
			return binarySearch(dizi, baş, orta-1, değer);
		}
	}

}
