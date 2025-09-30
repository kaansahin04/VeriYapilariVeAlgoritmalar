package stringVeArray;

public class ReverseWords {

	public static void main(String[] args) {
		String ifade=" programlama  öğrenme";
		String ifade2=kelimeleriDeğiştir(ifade);
		System.out.println(ifade2);
	}
	
	public static String kelimeleriDeğiştir(String ifade) {
		String ifadeYeni = ifade.trim();
        String[] ifadeDizi = ifadeYeni.split("\\s+");
        int kelime=ifadeDizi.length;
        StringBuilder terstenİfade = new StringBuilder();

        for (int i = kelime-1; i>=0; i--) {
            terstenİfade.append(ifadeDizi[i]);
            if (i != 0) {
                terstenİfade.append(" ");
            }
        }

        return terstenİfade.toString();
	}
	
}
