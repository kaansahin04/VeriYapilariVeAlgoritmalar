package veriyapıları;

public class BinaryTree {

	static Node kök;
	
	public static void main(String[] args) {
		kök=new Node(1);
		kök.sol=new Node(2);
		kök.sağ=new Node(3);
		kök.sol.sol=new Node(4);
		
		System.out.print("In-order Ağaç: ");
		inOrder(kök);
		System.out.println();

		System.out.print("Post-order Ağaç: ");
		postOrder(kök);
		System.out.println();
		
		System.out.print("Pre-order Ağaç: ");
		preOrder(kök);
		System.out.println();
	}
	
	private static void inOrder(Node kök) {
		if(kök!=null) {
			inOrder(kök.sol);
			System.out.print(kök.key);
			inOrder(kök.sağ);
		}
	}
	
	private static void postOrder(Node kök) {
		if(kök!=null) {
			postOrder(kök.sol);
			postOrder(kök.sağ);
			System.out.print(kök.key);
		}
	}
	
	private static void preOrder(Node kök) {
		if(kök!=null) {
			System.out.print(kök.key);
			preOrder(kök.sol);
			preOrder(kök.sağ);
		}
	}

}

class Node{
	int key;
	Node sol, sağ;
	public Node(int data) {
		key=data;
		sol=sağ=null;
	}
}