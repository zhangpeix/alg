package org.merger;

import org.base.Base;

public class MergeSort extends Base {
	
	
	public MergeSort(int n) {
		super(n);
	}
	

	@Override
	public void sort() {
		merge(0, a.length-1);

	}
	
	private void merge(int p,int r){
		int q;
		if(p<r){
			q=(p+r)/2;
			merge(p, q);
			merge(q+1, r);
			mergeSort(p, q, r);
		}
		
	}
	
	private void mergeSort(int p,int q,int r){
		int[] a1=new int[q-p+1];
		int[] a2=new int[r-q];
		for(int i=p;i<=q;i++){
			a1[i-p]=a[i];
		}
		for(int i=q+1;i<=r;i++){
			a2[i-q-1]=a[i];
		}
		int j=0;
		int k=0;
		for(int i=p;i<=r;i++){
			if(k>=a2.length){
				a[i]=a1[j];
				j++;
				continue;
			}
			if(j>=a1.length){
				a[i]=a2[k];
				k++;
				continue;
			}
			if(a1[j]>a2[k]){
				a[i]=a2[k];
				k++;
			}else{
				a[i]=a1[j];
				j++;	
			}
		}
		
		
		
	}
	

}
