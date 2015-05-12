package org.maxsubarray;

import java.util.Random;

public class MaxSubArray {
	protected int[] a;
	
	public MaxSubArray(int[] a) {
		super();
		this.a = a;
	}

	public MaxArrayInfo getMaxSubArray(){
		return findMaxArray(0, a.length-1);
	}

	public MaxArrayInfo findMaxArray(int low,int high){
		if(low==high){
			return new MaxArrayInfo(low,high,a[low]);
		}else{
			int mid=(int) Math.floor((double)(low+high)/2);
			MaxArrayInfo leftInfo=findMaxArray(low, mid);
			MaxArrayInfo rightInfo=findMaxArray(mid+1, high);
			MaxArrayInfo crossInfo=findCrossMaxSubArray(low, mid, high);
			if(leftInfo.getSum()>rightInfo.getSum()&&leftInfo.getSum()>crossInfo.getSum()){
				return leftInfo;
			}else if(rightInfo.getSum()>leftInfo.getSum()&&rightInfo.getSum()>crossInfo.getSum()){
				return rightInfo;
			}else{
				return crossInfo;
			}
		}
	}
	public MaxArrayInfo findCrossMaxSubArray(int low,int mid,int high){
		double sum=0;
		int i=mid;
		int maxLeft=i;
		double leftSum=a[i];
		do{
			sum+=a[i];
			if(sum>leftSum){
				leftSum=sum;
				maxLeft=i;
			}
			i--;
		}while(i>=low);
		
		
		sum=0;
		i=mid+1;
		int maxRight=i;
		double rightSum=a[i];
		do{
			sum+=a[i];
			if(sum>rightSum){
				rightSum=sum;
				maxRight=i;
			}
			i++;
		}while(i<=high);
		
		return new MaxArrayInfo(maxLeft, maxRight, rightSum+leftSum);
		
	}
	
	public void print(){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}
		System.out.println("");
	}
	public MaxArrayInfo getMaxSubArrayInfoFor(){
		int low=0;
		int high=0;
		int total=a[0];
		for(int i=0;i<a.length;i++){
			int sum=0;
			for(int j=i;j<a.length;j++){
				sum+=a[j];
				if(sum>total){
					total=sum;
					low=i;
					high=j;
				}
				
			}
		}
		return new MaxArrayInfo(low, high, total);
	}
	public MaxArrayInfo getMaxArrayInfoLinear(){
		int max=Integer.MIN_VALUE;
		int temp=0;
		int low=0;
		int high=0;
		for(int i=0;i<a.length;i++){
			temp+=a[i];
			if(temp>max){
				max=temp;
				high=i;
			}
			if(temp<0){
				temp=0;
				low=i+1;
				high=0;
			}
		}
		return new MaxArrayInfo(low, high, max);
	}
	public static void main(String[] args) {
		MaxSubArray maxSubArray=new MaxSubArray(new int[]{13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7});
		maxSubArray.print();
		MaxArrayInfo arrayInfo=maxSubArray.getMaxSubArray();
		System.out.println(arrayInfo.toString());
		MaxArrayInfo arrayInfo1=maxSubArray.getMaxSubArrayInfoFor();
		System.out.println(arrayInfo1.toString());
		System.out.print(maxSubArray.getMaxArrayInfoLinear().toString());
		
	}
	
}
