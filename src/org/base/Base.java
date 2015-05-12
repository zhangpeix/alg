package org.base;

import java.util.Random;

public abstract class Base {
	protected int[] a;
	
	public Base() {
		super();
	}

	public Base(int n) {
		super();
		a=new int[n];
		Random random=new Random(20);
		for(int i=0;i<a.length;i++){
			a[i]=random.nextInt(100);
		}
	}

	public void print(){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}
		System.out.println("");
	}
	
	public abstract void sort();
}
