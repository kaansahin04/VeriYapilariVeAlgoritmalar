package algoritmalar;

import java.util.Scanner;

public class Backtracking {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hangi satıra gitmek istiyorsun?: ");
		int m = scanner.nextInt();
		System.out.print("Hangi sütuna gitmek istiyorsun?: ");
		int n = scanner.nextInt();
		int sonuç = grid(1,1, m, n);
		System.out.println("1. satır 1. sütundan "+m+". satır "+n+". sütuna kaç yolla gidilebilir: "+ sonuç);	// ((m-1)+(n-1))'nin (m-1)'lisi (kombinasyon) ile hesaplanır
		scanner.close();
	}
	
	public static int grid(int x, int y, int m, int n){
		if(x == m && y == n){
			return 1;
		}
		else if(x <= m && y <= n){
			return grid(x+1, y, m, n) 			//1 adım aşağı git
					+ grid(x, y+1, m, n);		//1 adım sağa git
		}
		else{
			return 0;
		}
	}
	
}