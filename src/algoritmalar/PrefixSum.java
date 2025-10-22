package algoritmalar;

import java.util.ArrayList;
import java.util.List;

public class PrefixSum {

	public static void main(String[] args) {
		List<Integer> dizi=new ArrayList<>();
		dizi.add(3);
		dizi.add(6);
		dizi.add(2);
		dizi.add(8);
		dizi.add(9);
		dizi.add(2);
		int[][] sorgular = {{2,5}, {4,6}, {1,5}};
		System.out.println(String.valueOf(prefixSum(dizi, sorgular)));
	}
	
	public static List<Integer> prefixSum(List<Integer> dizi, int[][] sorgular) {
		List<Integer> prefix = new ArrayList<>();
		prefix.add(0);
		for(int i=0; i<dizi.size(); i++) {
			prefix.add(prefix.get(i) + dizi.get(i));
		}
		
		List<Integer> sonuc = new ArrayList<>();
		for(int i=0; i<sorgular.length; i++){
			sonuc.add(prefix.get(sorgular[i][1]) - prefix.get(sorgular[i][0] - 1));
		}
		
		return sonuc;
	}

}
