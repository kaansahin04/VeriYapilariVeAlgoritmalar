package stringVeArray;

public class StringCompression {

	public static void main(String[] args) {
		char chars[] = {'a','a','b','b','b','b','b','b','b','b','b','b','c'};
		System.out.println(compress(chars));
	}
	
	public static int compress(char[] chars) {
		int index=0;
		int başla=0;
		
		while(başla<chars.length) {
			int son=başla;
		
			while(son<chars.length && chars[başla]==chars[son]) {
				son++;
			}
			
			int sayaç=son-başla;
			chars[index++]=chars[başla];
			
			if(sayaç>=2) {
				char[] dizi=Integer.toString(sayaç).toCharArray();
				for(char i : dizi) {
					chars[index++]=i;
				}
			}
			
			başla=son;
		}
		
		return index;
	}

}
