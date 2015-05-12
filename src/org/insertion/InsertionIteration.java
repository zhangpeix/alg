package org.insertion;

import org.base.Base;

public class InsertionIteration extends Base {

	public InsertionIteration(int n) {
		super(n);
	}

	@Override
	public void sort() {
		iteration(a.length);

	}
	
	public void iteration(int n){
		if(n>0){
			n--;
			iteration(n);
			insertSort(n);
		}
	}
	public void insertSort(int n){
		int key=a[n];
		int j=n-1;
		while(j>=0&&a[j]>key){
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=key;
	}

}
