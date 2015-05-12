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
import org.quicksort.QuickSort;

public class Test {

	public static void main(String[] args) {
		Base base=new QuickSort(new int[]{1,1,1,1,1,1,1,1});
		base.print();
		base.sort();
		base.print();
	}
	public static  void swap(int a,int b){
		int temp=a;
		a=b;
		b=temp;
	}

}
