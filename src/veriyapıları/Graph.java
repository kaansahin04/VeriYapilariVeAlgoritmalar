package veriyapıları;

import java.util.ArrayList;

public class Graph {
	
	static ArrayList<Node3> nodes;
	static int[][] matris;
	
	public static void main(String[] args) {
		matrisOlustur(5);
		
		düğümEkle(new Node3('A'));
		düğümEkle(new Node3('B'));
		düğümEkle(new Node3('C'));
		düğümEkle(new Node3('D'));
		düğümEkle(new Node3('E'));
		
		kenarEkle(0,1);
		kenarEkle(1,2);
		kenarEkle(1,4);
		kenarEkle(2,3);
		kenarEkle(2,4);
		kenarEkle(4,0);
		kenarEkle(4,2);
		
		System.out.println("A->B: "+kenarKontrol(0,1));
		System.out.println("D->E: "+kenarKontrol(3,4));
		System.out.println("C->E: "+kenarKontrol(2,4));
		
		yazdır();
	}
	
	private static void matrisOlustur(int boyut) {
		nodes=new ArrayList<>();
		matris=new int[boyut][boyut];
	}
	
	private static void düğümEkle(Node3 node) {
		nodes.add(node);
	}
	
	private static void kenarEkle(int kimden, int kime) {
		matris[kimden][kime]=1;
	}
	
	private static boolean kenarKontrol(int kimden, int kime) {
		if(matris[kimden][kime]==1) {
			return true;
		}else {
			return false;
		}
	}
	
	private static void yazdır() {
		System.out.print("  ");
		for(int i=0; i<nodes.size(); i++) {
			System.out.print(nodes.get(i).key + " ");
		}
		System.out.println();
		
		for(int i=0; i<matris.length; i++) {
			System.out.print(nodes.get(i).key + " ");
			for(int j=0; j<matris[i].length; j++) {
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class Node3{
	char key;
	
	public Node3(char key) {
		this.key=key;
	}
}