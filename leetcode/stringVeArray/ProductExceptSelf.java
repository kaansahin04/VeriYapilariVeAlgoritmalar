package stringVeArray;

public class ProductExceptSelf {

	public static void main(String[] args) {
		int nums[] = {1,2,0,-3,8};
		int sonuç[]=çarp(nums);
		for(int i=0; i<sonuç.length; i++) {
			System.out.println(sonuç[i]+" ");
		}
	}
	
	public static int[] çarp(int nums[]) {
		int sola[] = new int[nums.length];
		int sağa[] = new int[nums.length];
		
		int çarpan=1;
		for(int i=0; i<nums.length; i++) {
			sola[i]=çarpan;
			çarpan*=nums[i];
		}
		
		çarpan=1;
		for(int i=nums.length-1; i>=0; i--) {
			sağa[i]=çarpan;
			çarpan*=nums[i];
		}
		
		int çarpımlar[]=new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			çarpımlar[i]=sola[i]*sağa[i];
		}
		
		return çarpımlar;
	}

}
