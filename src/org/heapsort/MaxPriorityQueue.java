package org.heapsort;

public interface MaxPriorityQueue {
	
	public void insert(int x);
	
	public int maximum();
	
	public int extractMax();
	
	public void increaseKey(int x,int key);
}
