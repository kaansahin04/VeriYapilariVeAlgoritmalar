package algoritmalar;

public class BitManipulation {

	public static void main(String[] args) {
		System.out.println("5 sayısında binary olarak "+manipulation(5)+" adet 1 vardır.");
		System.out.println("5 sayısını binary 1 birim sola kaydırınca "+manipulation(5>>1)+" adet 1 olur.");
		System.out.println("24 sayısında binary olarak "+manipulation(24)+" adet 1 vardır.");
		System.out.println("31 sayısında binary olarak "+manipulation(31)+" adet 1 vardır.");
	}
	
	private static int manipulation(int n) {
		return Integer.bitCount(n);
	}

}
