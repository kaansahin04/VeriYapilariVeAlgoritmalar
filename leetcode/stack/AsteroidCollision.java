package stack;

import java.util.*;

public class AsteroidCollision {

	public static void main(String[] args) {
		int[] asteroids = {5,10,-5, 3, -16};
		for(int i=0; i<collision(asteroids).length; i++) {
			System.out.print(collision(asteroids)[i]+" ");
		}
	}

	public static int[] collision(int[] asteroids) {
		Stack<Integer> yığıt=new Stack<>();
		for(int i:asteroids) {
			if(i>0) {
				yığıt.add(i);
			}else {
				while(!yığıt.empty() && yığıt.peek()>0 && yığıt.peek()<Math.abs(i)) {
					yığıt.pop();
				}
				if(yığıt.empty() || yığıt.peek()<0) {
					yığıt.add(i);
				}else if(Math.abs(i)==yığıt.peek()) {
					yığıt.pop();
				}
			}
		}
		
		int[] sonuc = new int[yığıt.size()];
		for(int i=0; i<yığıt.size(); i++) {
			sonuc[i]=yığıt.get(i);
		}
		
		return sonuc;
	}
	
}
