package exercise;

// [5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오 

public class exercise5_4 {

	public static void main(String[] args) {
	
		int[][] arr = {
		{ 5, 5, 5, 5, 5},
		{10,10,10,10,10},
		{20,20,20,20,20},
		{30,30,30,30,30}
		};
		
		int totalSum =0; 
		int totalCnt =0;
		float totalAvg = 0f;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				totalSum +=arr[i][j];
				totalCnt++;
			}
		}
		System.out.println("합계 "+totalSum);
		System.out.println("평균 "+(float)totalSum/totalCnt);
	} // end of main

}
