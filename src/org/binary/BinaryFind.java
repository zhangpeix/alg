package org.binary;

import org.base.Base;
import org.insertion.Insertion;
import org.insertion.InsertionBianry;

public class BinaryFind extends Insertion {
	
	public BinaryFind(int n) {
		super(n);
		super.sort();
		super.print();
	}

	public boolean find(int value,int q,int r){
		if(q<r){
			int middle=(int) Math.ceil((double)(q+r)/2);
			if(a[middle]<value){
				return find(value, middle, r);
			}else if(a[middle]>value){
				return find(value, q, middle-1);
			}else if(a[middle]==value){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		BinaryFind base=new BinaryFind(20);
		System.out.println(base.find(90, 0, 19));
	}
}
