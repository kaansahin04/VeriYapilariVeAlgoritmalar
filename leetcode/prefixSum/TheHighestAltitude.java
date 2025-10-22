package prefixSum;

public class TheHighestAltitude {

	public static void main(String[] args) {
		int irtifa[] = {-5,1,5,0,-7};
		System.out.println(altitude(irtifa));
	}

	public static int altitude(int[] irtifa) {
		int yükseklik=0;
		int anlık=0;
		
		for(int değişim:irtifa) {
			anlık+=değişim;
			yükseklik=Math.max(anlık, yükseklik);
		}
		
		return yükseklik;
	}
	
}
