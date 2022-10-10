package ch06_oop;

import java.util.Arrays; // Ctrl + Shift + O;
import java.util.Collections;


public class ReferenceParamEx3 {

	public static void main(String[] args) {
		int[] arr = new int[] {3, 2, 1, 6, 5, 4};

		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum="+sumArr(arr)); //배열의 총 합을 출력
	}

	static void printArr(int[] arr) {
		System.out.print("[");
		for(int i : arr)
			System.out.print(i+",");
		System.out.println(']');
	}

	static int sumArr(int[] arr) {
		int sum =0;
		for(int i : arr)
			sum +=i;
		return sum;
	}

	static void sortArr(int[] arr) { // 이거 버블정렬
//				Arrays.sort(arr); //버블정렬 이거 한줄로 됨(오름차순 정렬)
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp;
					tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}



