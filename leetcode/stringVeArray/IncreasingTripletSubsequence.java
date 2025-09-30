package stringVeArray;

public class IncreasingTripletSubsequence {

	public static void main(String[] args) {
		int nums[] = {2,5,2,7,9};
		System.out.println(triplet(nums));
	}
	
	public static boolean triplet(int[] nums) {
		int ilk=Integer.MAX_VALUE;
		int ikinci=Integer.MAX_VALUE;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]<=ilk) {
				ilk=nums[i];
			}else if(nums[i]<=ikinci) {
				ikinci=nums[i];
			}else {
				return true;
			}
		}
		return false;
	}

}
