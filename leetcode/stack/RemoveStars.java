package stack;

import java.util.*;

public class RemoveStars {

	public static void main(String[] args) {
		String ifade="leet**cod*e";
		System.out.println(removeStars(ifade));
	}
	
	public static String removeStars(String ifade) {
		Stack<Character> yığıt=new Stack<>();
		char[] ifadeDizi=ifade.toCharArray();
		
		for(char ch:ifadeDizi) {
			if(ch=='*') {
				yığıt.pop();
			}else {
				yığıt.add(ch);
			}
		}

		String sonuc="";
		for(char ch:yığıt) {
			sonuc=sonuc+ch;
		}
		
		return sonuc;
	}

}
