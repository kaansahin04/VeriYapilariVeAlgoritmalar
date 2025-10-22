package hashMapSet;

import java.util.*;

public class EqualRowColumnPairs {

	public static void main(String[] args) {
		int[][] matris= {{3,1,2,2}, {1,4,4,5}, {2,4,2,2}, {2,4,2,2}};
		System.out.println(equalPairs(matris));
	}
	
	public static int equalPairs(int[][] matris) {
		int sayaç=0;
		int uzunluk=matris.length;
		
		Map<String, Integer> satırSayacı=new HashMap<>();
		for(int[] satır:matris) {
			String satırString=Arrays.toString(satır);
			satırSayacı.put(satırString, satırSayacı.getOrDefault(satırString, 0) + 1);
		}
		
		for(int sütun=0; sütun<uzunluk; sütun++) {
			int[] sütunDizisi=new int[uzunluk];
			for(int satır=0; satır<uzunluk; satır++) {
				sütunDizisi[satır]=matris[satır][sütun];
			}
			sayaç+=satırSayacı.getOrDefault(Arrays.toString(sütunDizisi), 0);
		}
		
		return sayaç;
	}

}
