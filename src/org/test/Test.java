package org.test;

import java.util.Random;

import org.base.Base;
import org.heapsort.HeapSort;
import org.insertion.Insertion;
import org.insertion.InsertionBianry;
import org.insertion.InsertionIteration;
import org.matrix.Matrix;
import org.maxsubarray.MaxArrayInfo;
import org.maxsubarray.MaxSubArray;
import org.merger.InversionCount;
import org.merger.MergeSort;

public class Test {

	public static void main(String[] args) {
		HeapSort base=new HeapSort(10);
		base.insert(100);
		base.increaseKey(3, 125);
		base.print();
	}
	public static  void swap(int a,int b){
		int temp=a;
		a=b;
		b=temp;
	}

}
