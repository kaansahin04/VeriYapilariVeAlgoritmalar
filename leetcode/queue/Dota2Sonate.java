package queue;

import java.util.*;

public class Dota2Sonate {
	
	public static void main(String[] args) {
		String senato="RRDRDDRRD";
		System.out.println(partyVictory(senato));
	}

	public static String partyVictory(String senato) {
		Queue<Integer> radiant=new LinkedList<>();
		Queue<Integer> dire=new LinkedList<>();
		
		int n=senato.length();
		
		for(int i=0; i<n; i++) {
			if(senato.charAt(i)=='R') {
				radiant.add(i);
			}else {
				dire.add(i);
			}
		}
		
		while(!radiant.isEmpty() && !dire.isEmpty()) {
			int rID=radiant.poll();
			int dID=dire.poll();
			if(rID<dID) {
				radiant.add(rID+n);
			}else {
				dire.add(dID+n);
			}
		}
		
		return radiant.size()>dire.size()? "Radiant" : "Dire";
	}
	
}
