package org.matrix;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
	private double[][] matrix;
	
	public Matrix(double[][] matrix) {
		super();
		this.matrix = matrix;
	}
	

	public Matrix(int rows,int cols) {
		super();
		matrix=new double[rows][cols];
		Random random=new Random(100);
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				matrix[i][j]=random.nextDouble()*100;
			}
		}
	}



	public Matrix multiplyNormal(Matrix b){
		double[][] s=b.getMatrix();
		int rows=matrix.length;
		int cols=matrix[0].length;
		int rowsb=s.length;
		int colsb=s[0].length;
		if(cols!=rowsb){
			return null;
		}
		double[][] c=new double[rows][colsb];
		for(int i=0;i<rows;i++){
			for(int j=0;j<colsb;j++){
				for(int k=0;k<cols;k++){
					c[i][j]+=matrix[i][k]*s[k][j];
				}
				
			}
		}
		return new Matrix(c);
		
	}
	
	/*
	 * S1=B12-B22
	 * S2=A11+A12
	 * S3=A21+A22
	 * S4=B21-B11
	 * S5=A11+A22
	 * S6=B11+B22
	 * S7=A12-A22
	 * S8=B21+B22
	 * S9=A11-A21
	 * S10=B11+B12
	 * 
	 * 
	 * P1=A11*S1=A11*B12-A11*B22
	 * P2=S2*B22=A11*B22+A12*B22
	 * P3=S3*B11=A21*B11+A22*B11
	 * P4=A22*S4=A22*B21-A22*B11
	 * P5=S5*S6=A11*B11+A11*B22+A22*B11+A22*B22
	 * P6=S7*S8=A12*B12+A12*B22-A22*B12-A22*B22
	 * P7=S9*S10=A11*B11+A11*B12-A21*B11-A21*B12
	 * 
	 * C11=P5+P4-P2+P6
	 * C12=P1+P2
	 * C21=P3+P4
	 * C22=P5+P1-P3-P7
	 * 
	 * n*n
	 * 
	 */
	
	public Matrix multiplyStrassen(Matrix b){
		return null;
	}
	 
	
	


	public double[][] getMatrix() {
		return matrix;
	}


	public void setMatrix(double[][] matrix) {
		this.matrix = matrix;
	}


	@Override
	public String toString() {
		int rows=matrix.length;
		StringBuffer sb=new StringBuffer("Matrix=").append("\n");
		for(int i=0;i<rows;i++){
			sb.append(Arrays.toString(matrix[i])).append("\n");
		}
		return sb.toString();
	}
	
	
	
}
