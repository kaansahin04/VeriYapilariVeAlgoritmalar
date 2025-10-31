package queue;

import java.util.*;

public class NumberOfRecentCalls {

	Queue<Integer> kuyruk;
	
	public NumberOfRecentCalls(){
		kuyruk=new LinkedList<>();
	}
	
	public int ping(int t) {
		kuyruk.add(t);
		
		while(kuyruk.peek() < t-3000) {
			kuyruk.poll();
		}
		
		return kuyruk.size();
	}

}
