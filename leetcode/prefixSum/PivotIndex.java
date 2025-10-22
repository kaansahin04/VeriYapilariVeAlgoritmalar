package prefixSum;

public class PivotIndex {

	public static void main(String[] args) {
		int dizi[] = {1,7,3,6,5,6};
		System.out.println(pivotumdur(dizi));
	}
	
	public static int pivotumdur(int[] dizi) {
		int pivot=0;
		int toplam=0;
		int solTaraf=0;
		
		for(int i:dizi) {
			toplam+=i;
		}
		
		for(int i=0; i<dizi.length; i++) {
			int sağTaraf=toplam-solTaraf-dizi[i];
			if(solTaraf==sağTaraf) {
				pivot=i;
				return pivot;
			}
			solTaraf+=dizi[i];
		}
		
		return -1;
	}

}
