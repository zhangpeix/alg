package org.util;

public class Utils {
	public  static void swap(int[] data,int index1,int index2){
		int temp=data[index1];
		data[index1]=data[index2];
		data[index2]=temp;
	}
}
