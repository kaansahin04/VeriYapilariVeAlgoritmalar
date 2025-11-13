package veriyapıları;

import java.util.Arrays;

public class Heap {

	static int size=0;
	static int kapasite=10;
	static int[] items={21,53,22,5,67,4,7,12,3,30};
	
	private static int getSolÇocuk(int ebeveyn) {return 2*ebeveyn+1;}
	private static int getSağÇocuk(int ebeveyn) {return 2*ebeveyn+2;}
	private static int getEbeveyn(int çocuk) {return (çocuk-1)/2;}
	
	private static boolean kontrolSolÇocuk(int ebeveyn) {return getSolÇocuk(ebeveyn) < size;}
	private static boolean kontrolSağÇocuk(int ebeveyn) {return getSağÇocuk(ebeveyn) < size;}
	private static boolean kontrolEbeveyn(int çocuk) {return getEbeveyn(çocuk) >= 0;}
	
	private int solÇocuk(int ebeveyn) {return items[getSolÇocuk(ebeveyn)];}
	private int sağÇocuk(int ebeveyn) {return items[getSağÇocuk(ebeveyn)];}
	private int ebeveyn(int çocuk) {return items[getEbeveyn(çocuk)];}

	private void değiştir(int index1, int index2) {
		int temp=items[index1];
		items[index1]=items[index2];
		items[index2]=temp;
	}
	
	private void kapasiteArtır() {
		if(size==kapasite) {
			items=Arrays.copyOf(items, kapasite*2);
			kapasite*=2;
		}
	}
	
	public int peek() {
		if(size==0) {
			throw new IllegalStateException();
		}
		return items[0];
	}
	
	public int poll() {
		if(size==0) {
			throw new IllegalStateException();
		}
		int item=items[0];
		items[0]=items[size-1];
		size--;
		heapifyDown();
		return item;
	}
	
	public void add(int item) {
		kapasiteArtır();
		items[size]=item;
		size++;
		heapifyUp();
	}
	
	public void heapifyUp() {
		int index=size-1;
		while(kontrolEbeveyn(index) && ebeveyn(index)>items[index]) {
			değiştir(getEbeveyn(index), index);
			index=getEbeveyn(index);
		}
	}
	
	public void heapifyDown() {
		int index=0;
		while(kontrolSolÇocuk(index)) {
			int küçükÇocuk=getSolÇocuk(index);
			if(kontrolSağÇocuk(index) && sağÇocuk(index)<solÇocuk(index)) {
				küçükÇocuk=getSağÇocuk(index);
			}
			if(items[index]<items[küçükÇocuk]) {
				break;
			}else {
				değiştir(index, küçükÇocuk);
			}
			index=küçükÇocuk;
		}
	}
	
}
