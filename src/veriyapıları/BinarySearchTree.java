package veriyapıları;

public class BinarySearchTree {

	static Node2 kök;
	
	public static void main(String[] args) {
		
		eklet(new Node2(5));
		eklet(new Node2(2));
		eklet(new Node2(7));
		eklet(new Node2(4));
		eklet(new Node2(6));
		eklet(new Node2(8));
		eklet(new Node2(3));
		
		göster(kök);

		System.out.println();
		
		System.out.println("3: "+ara(kök, 3));
		System.out.println("9: "+ara(kök, 9));
		System.out.println("8: "+ara(kök, 8));
		
		kaldırt(4);
		göster(kök);
		System.out.println();
		kaldırt(7);
		göster(kök);
		
	}
	
	public static void eklet(Node2 düğüm) {
		kök=ekle(kök, düğüm);
	}
	
	public static Node2 ekle(Node2 kök, Node2 düğüm) {
		int data=düğüm.data;
		
		if(kök==null) {
			kök=düğüm;
			return kök;
		}else if(data<kök.data) {
			kök.sol=ekle(kök.sol, düğüm);
		}else {
			kök.sağ=ekle(kök.sağ, düğüm);
		}
		
		return kök;
	}
	
	public static void göster(Node2 kök) {
		if(kök!=null) {
			göster(kök.sol);
			System.out.print(kök.data);
			göster(kök.sağ);
		}
	}
	
	public static boolean ara(Node2 kök, int data) {
		if(kök==null) {
			return false;
		}else if(kök.data==data) {
			return true;
		}else if(kök.data>data) {
			return ara(kök.sol, data);
		}else {
			return ara(kök.sağ, data);
		}
	}
	
	public static void kaldırt(int data) {
		if(ara(kök, data)) {
			kaldır(kök, data);
		}else {
			System.out.println("Böyle bir düğüm bulunamadı!");
		}
	}
	
	public static Node2 kaldır(Node2 kök, int data) {
		if(kök==null) {
			return kök;
		}else if(kök.data>data){
			kök.sol=kaldır(kök.sol,data);
		}else if(kök.data<data){
			kök.sağ=kaldır(kök.sağ,data);
		}else {
			if(kök.sol==null && kök.sağ==null) {
				kök=null;
			}else if(kök.sağ!=null) {
				kök.data=halef(kök);
				kök.sağ=kaldır(kök.sağ, kök.data);
			}else {
				kök.data=selef(kök);
				kök.sol=kaldır(kök.sol, kök.data);
			}
		}
		return kök;
	}
	
	public static int halef(Node2 kök) {
		kök=kök.sağ;
		
		while(kök.sol!=null) {
			kök=kök.sol;
		}
		
		return kök.data;
	}
	
	public static int selef(Node2 kök) {
		kök=kök.sol;
		
		while(kök.sağ!=null) {
			kök=kök.sağ;
		}
		
		return kök.data;
	}

}

class Node2{
	int data;
	Node2 sol;
	Node2 sağ;
	
	public Node2(int data) {
		this.data=data;
		sol=sağ=null;
	}
}
