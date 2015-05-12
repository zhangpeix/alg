package org.insertion;

import org.base.Base;

public class InsertionBianry extends Base {

	public InsertionBianry(int n) {
		super(n);
	}

	@Override
	public void sort() {
		for(int i=1;i<a.length;i++){          //n
			int key=a[i];                     //n-1
			int n=i-1;						  //n-1		
			int k=binaryFind(key, 0, n);      //n-1
			if(k!=-1){                        //n-1
				while(n>=k){                  //sum(tj)  j=1....n-1
					a[n+1]=a[n];			  //sum(tj)-1  j=1....n-1
					n--;					  //sum(tj)-1  j=1....n-1
				}
				a[n+1]=key;                    //n-1
			}
		}

	}
	
	public int binaryFind(int value,int begin,int end){        //2T(n/2)+1
		if(begin<end){
			int middle=(int) Math.ceil((double)(begin+end)/2);
			if(a[middle]>value){
				return binaryFind(value, middle, end);        
			}else if(a[middle]<value){
				return binaryFind(value,begin,middle-1);
			}else if(a[middle]==value){
				return middle;
			}
		}else{ 
			if(a[end]<value){
				return end;
			}else{
				return end+1;
			}
		}
		return -1;
	}
	
	public int binary(int value,int begin,int end){
		for(int i=begin;i<=end;i++){
			if(a[i]<value){
				return i;
			}
		}
		return -1;
	}
	

}
