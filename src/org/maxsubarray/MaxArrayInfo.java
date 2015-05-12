package org.maxsubarray;

public class MaxArrayInfo {
	private int low;
	private int high;
	private double sum;
	
	public MaxArrayInfo() {
		super();
	}
	
	public MaxArrayInfo(int low, int high, double sum) {
		super();
		this.low = low;
		this.high = high;
		this.sum = sum;
	}

	public int getLow() {
		return low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "MaxArrayInfo [low=" + low + ", high=" + high + ", sum=" + sum
				+ "]";
	}
	
	
}
