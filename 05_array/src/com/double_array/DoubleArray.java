package com.double_array;

import java.util.*;

public class DoubleArray {
	
	public void basicDoubleArray()	{
//		2차원 배열 바둑판 형식의 저장소를 의미한다.
		int[][] arr = new int[3][3];
		arr[0][0]=100;
		arr[0][1]=200;
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		
		System.out.println(arr[0][2]);
//		초기화 안 하면 무조건 default값이 저장됨
	}
	
	
//	for문을 이용해서 이차원 배열을 처리하기
	public void DoubleArrayFor() {
		int[][] arr = new int [3][3];
			for(int i =0; i<arr.length; i++) {
					for(int j=0; j<arr.length; j++) {
						arr[i][j]=new Random().nextInt(9)+1;
					}
			}
			for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[i].length; j++) {
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
			}
	}		
			
	public void DoubleArrayFor2() {
		int[][] arr2 = new int [3][5];
			for(int i =0; i<arr2.length; i++) {
				for(int j=0; j<arr2[i].length; j++) {
					arr2[i][j]=new Random().nextInt(9)+1;
				}
		}
			for(int i=0; i<arr2.length; i++) {
					for(int j=0; j<arr2[i].length; j++) {
						System.out.print(arr2[i][j]+" ");
					}
					System.out.println();
			}
			
			
	}
}
