package org.heapsort;

import java.util.Arrays;

import org.base.Base;

public class HeapSort extends Base implements MaxPriorityQueue{
	
	public HeapSort(int n) {
		super(n);
		bulidHeap();
	}


	@Override
	public void sort() {
		int heapSize=a.length-1;
		for(int i=a.length-1;i>0;i--){
			int temp=a[0];
			a[0]=a[i];
			a[i]=temp;
			heapSize=heapSize-1;
			maxHeapify(0,heapSize);
		}

	}
	
	public void maxHeapify(int i,int length){
		int left=left(i);
		int right=right(i);
		int imax=i;
		if(left<=length && a[left] > a[imax]){
			imax=left;
		}
		if(right<=length && a[right] > a[imax]){
			imax=right;
		}
		
		if(i!=imax){
			int temp=a[imax];
			a[imax]=a[i];
			a[i]=temp;
			maxHeapify(imax,length);
		}
	}
	
	
	public void bulidHeap(){
		int plength=(int) (Math.floor((double)a.length/2)-1);
		for(int i=plength;i>=0;i--){
			maxHeapify(i,a.length-1);
		}
	}
	
	public int parent(int i){
		return  (int) Math.floor((double)(i+1)/2)-1;
	}
	
	public int left(int i){
		return 2*i+1;
	}
	
	public int right(int i){
		return 2*i+2;
	}


	@Override
	public void insert(int key) {
		a=Arrays.copyOf(a, a.length+1);
		a[a.length-1]=key;
		int i=a.length-1;
		while(i>0 && a[parent(i)]<a[i]){
			int temp=a[i];
			a[i]=a[parent(i)];
			a[parent(i)]=temp;
			i=parent(i);
		}
	}


	@Override
	public int maximum() {
		return a[0];
	}


	@Override
	public int extractMax() {
		int max=a[0];
		a[0]=a[a.length-1];
		a=Arrays.copyOf(a, a.length-1);
		maxHeapify(1, a.length-1);
		return max;
	}


	@Override
	public void increaseKey(int i, int key) {
		if(a[i]>key){
			throw new RuntimeException("smaller");
		}
		a[i]=key;
		while(i>0 && a[parent(i)]<a[i]){
			int temp=a[i];
			a[i]=a[parent(i)];
			a[parent(i)]=temp;
			i=parent(i);
		}
		
	}
	

}
