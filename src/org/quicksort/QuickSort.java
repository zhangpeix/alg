package org.quicksort;

import org.base.Base;
import org.util.Utils;

public class QuickSort extends Base{

	public QuickSort(int i) {
		super(i);
	}
	

	public QuickSort(int[] a) {
		super();
		this.a=a;
	}


	@Override
	public void sort() {
		quickSort(0, a.length-1);
		
	}
	
	public void quickSort(int p,int r){
		if(p<r){
			int q=partition(p, r);
			quickSort(p, q-1);
			quickSort(q+1, r);
		}
	}
	
	public int partition(int p,int r){
		int i=p-1;
		for(int j=p;j<r;j++){
			if(a[j]<a[r]){
				i++;
				Utils.swap(super.a, i, j);
			}
		}
		Utils.swap(super.a, i+1, r);
		if((i+1)==p){
			return (int) Math.floor((double) (p+r)/2);
		}else{
			return i+1;
		}
		
	}
	 	
}
