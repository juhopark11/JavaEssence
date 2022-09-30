package ch5_array;

public class ArrayEx18 {

	public static void main(String[] args) {
		 int[][] score = { // 2차원배열의 생성과 초기화를 동시에 함. (초기화:값을 넣음)
							  {100, 100, 100}
							, { 20, 20, 20}
							, { 30, 30, 30}
							, { 40, 40, 40}
						};
		 
//		 int sum =0; 
//		 for(int i=0; i <score.length; i++) {
//			 for(int j=0; j <score[i].length; j++) {
//				 
//				sum += score[i][j];
//
//			 }
//		 }
//			System.out.println(sum);


		 // 향상된 for문을 활용해보자. 
		 int sum =0; 
		 
		 for(타입변수명 : 배열또는 컬렉션) {
			 // 반복할 문장.
		 }
		 
		 for()
//		int sum = 0;
//
//		for(int i=0;i < score.length;i++) {
//			for(int j=0;j < score[i].length;j++) {
//				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
//			}
//		}
//
//		for (int[] tmp : score) { 
//			 for (int i : tmp) { 
//				sum += i;
//			 } 
//		} 
//
//		System.out.println("sum="+sum);
	}
}
