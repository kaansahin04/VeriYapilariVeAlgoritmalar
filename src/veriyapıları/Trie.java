package veriyapıları;

import java.util.*;

public class Trie {

	private static TrieNode kök;
	
	public static void main(String[] args) {
		kök=new TrieNode();
		ekle("Kaan");
		System.out.println(ara("Kahraman"));
		ekle("Kahraman");
		System.out.println(ara("Kahraman"));
		System.out.println(başKontrolü("K"));
		System.out.println(başKontrolü("Ka"));
		System.out.println(başKontrolü("Kah"));
		System.out.println(başKontrolü("Kaa"));
		System.out.println(başKontrolü("Zoz"));
	}
	
	private static void ekle(String kelime) {
		TrieNode düğüm=kök;
		char[] dizi=kelime.toCharArray();
		for(char harf:dizi) {
			if(!düğüm.harfler.containsKey(harf)) {
				düğüm.harfler.put(harf, new TrieNode());
			}
			düğüm=düğüm.harfler.get(harf);
		}
		düğüm.kelimeSonu=true;
	}
	
	private static boolean ara(String kelime) {
		TrieNode düğüm=kök;
		char[] dizi=kelime.toCharArray();
		for(char harf:dizi) {
			if(!düğüm.harfler.containsKey(harf)) {
				return false;
			}
			düğüm=düğüm.harfler.get(harf);
		}
		return düğüm.kelimeSonu;
	}
	
	private static boolean başKontrolü(String ifade) {
		TrieNode düğüm=kök;
		char[] dizi=ifade.toCharArray();
		for(char harf:dizi) {
			if(!düğüm.harfler.containsKey(harf)) {
				return false;
			}
			düğüm=düğüm.harfler.get(harf);
		}
		return true;
	}

}

class TrieNode{
	Map<Character, TrieNode> harfler=new HashMap<>();
	boolean kelimeSonu=false;
}