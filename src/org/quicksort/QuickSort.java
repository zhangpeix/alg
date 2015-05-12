package org.quicksort;

import org.base.Base;

public class QuickSort extends Base{

	@Override
	public void sort() {
		
		
	}
	
	public void quickSort(int p,int r){
		if(p<r){
			int q=(int) Math.floor((double) (p+r)/2);
			partition(p, r);
			quickSort(p, q);
			quickSort(q+1, r);
		}
	}
	
	public void partition(int p,int r){
		int key=a[r];
		
	}
	 	
}
