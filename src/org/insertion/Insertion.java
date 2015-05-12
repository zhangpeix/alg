package org.insertion;

import org.base.Base;

public class Insertion extends Base{

	public Insertion(int n) {
		super(n);
	}

	@Override
	public void sort() {
		if(a!=null && a.length>0){
			for(int i=1;i<a.length;i++){
				int k=a[i];
				int j=i-1;
				while(j>=0&&a[j]>k){
					a[j+1]=a[j];
					j--;
				}
				a[j+1]=k;
			}
		}
		
	}
	
}
