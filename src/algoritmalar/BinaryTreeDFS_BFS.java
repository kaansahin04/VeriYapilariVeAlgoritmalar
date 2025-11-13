package algoritmalar;

import java.util.*;

public class BinaryTreeDFS_BFS {
	
	static Node kök;

	public static void main(String[] args) {
		kök=new Node(1);
		kök.sol=new Node(2);
		kök.sağ=new Node(3);
		kök.sol.sol=new Node(4);
		
		long süre=System.nanoTime();
		System.out.println(dfs(kök, 3));
		System.out.println(dfs(kök, 5));
		long süre2=System.nanoTime();
		long zaman=süre2-süre;
		System.out.println(zaman);
		
		System.out.println();
		
		long süre3=System.nanoTime();
		System.out.println(bfs(3));
		System.out.println(bfs(5));
		long süre4=System.nanoTime();
		long zaman2=süre4-süre3;
		System.out.println(zaman2);
	}
	
	private static boolean dfs(Node kök, int key) {
		if(kök==null) {
			return false;
		}else if(kök.key==key){
			return true;
		}else {
			return dfs(kök.sol, key) || dfs(kök.sağ, key);
		}
	}
	
	private static boolean bfs(int key) {
		Queue<Node> kuyruk=new LinkedList<>();
		kuyruk.add(kök);
		
		while(!kuyruk.isEmpty()) {
			Node düğüm=kuyruk.poll();
			if(düğüm.key==key) {
				return true;
			}
			if(düğüm.sol!=null){
				kuyruk.add(düğüm.sol);
			}
			if(düğüm.sağ!=null) {
				kuyruk.add(düğüm.sağ);
			}
		}
		
		return false;
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