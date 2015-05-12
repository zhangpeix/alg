package org.merger;

import org.base.Base;

public class InversionCount extends Base {

	public InversionCount(int n) {
		super(n);
	}
	
	public InversionCount(int[] a) {
		super();
		this.a=a;
	}



	@Override
	public void sort() {
		System.out.println(merge(0, a.length-1));

	}
	
	public int merge(int begin,int end){
		int count=0;
		if(begin<end){
			int mid=(int) Math.ceil((double) (begin+end)/2);
			count+=merge(begin, mid-1);
			count+=merge(mid, end);
			count+=mergeSort(begin,mid,end);
		}
		return count;
		
	}
	public int mergeSort(int begin,int mid,int end){
		int count=0;
		int[] a1=new int[mid-begin];
		int[] a2=new int[end-mid+1];
		for(int i=begin;i<=mid-1;i++){
			a1[i-begin]=a[i];
		}
		for(int i=mid;i<=end;i++){
			a2[i-mid]=a[i];
		}
		int k1=0;
		int k2=0;
		for(int i=begin;i<=end;i++){
			if(k1>=a1.length){
				a[i]=a2[k2];
				k2++;
				continue;
			}
			if(k2>=a2.length){
				a[i]=a1[k1];
				k1++;
				continue;
			}
			if(a1[k1]>a2[k2]){
				count=count+a1.length-k1;
				a[i]=a2[k2];
				k2++;
			}else{
				a[i]=a1[k1];
				k1++;
			}
		}
		return count;
		
	}
	
	public void test(){
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
