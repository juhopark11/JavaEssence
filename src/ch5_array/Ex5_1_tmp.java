package ch5_array;

import java.util.Arrays; // crtl + shitf + o 자동으로 import 

public class Ex5_1_tmp {

	public static void main(String[] args) {
		
		
		/*
		 * int[] arr = new int[5]; // 길이가 5인 배열 arr을 생성
		 * System.out.println("arr.length의 값은="+arr.length);
		 * 
		 * for(int i = 0; i<10; i++) System.out.println(i+"의 값은="+arr[i]); //배열 선언은 5이나,
		 * 10을 써서(범위를 벗어나서) Out of bound 에러 발생
		 * 
		 * for(int i = 0; i<arr.length; i++) System.out.println(i+"의 값은="+arr[i]);
		 */
		  
	     //배열의 출력
		int[] iArr = {100, 95, 80, 70, 60};
		
		for(int i=0; i<iArr.length; i++ ) {				
		System.out.println(iArr[i]);
		}
		
		// 더 쉽게 출력하는 방법
		System.out.println(Arrays.toString(iArr));
		
		 		
	}

}
