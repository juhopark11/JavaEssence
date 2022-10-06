package tmp;

public class array2 {
	public static void main(String[] args) {
//		int sum =0; 
//		float avg = 0f; 
//		
//		int[] score = {100, 88, 100, 100, 90};
//		
//		for(int i=0; i < score.length; i++) {
//			sum += score[i];
//		}
//		avg = (float)sum/score.length; //두군데 중 아무곳에 넣어도 됨.
//		// 478/(float)5 -> 478/5.0f -> 478.0f/5.0f 
//		// int인 478이 float인 5.0f에 맞춰줘야 하니까 자동 형변환 됨. 
//		System.out.println("총합은 "+sum+"점 입니다.");
//		System.out.println("평균은 "+avg+"점 입니다.");
//		System.out.println(score.length);
		
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		int max = score[0]; //배열의 첫번째 값으로 초기화! 
		int min = score[0]; // 0으로 하면 min이 0으로 나옴. so,배열값으로 초기화!
		
		for(int i=0; i<score.length;i++) {
			if(score[i]> max) {
				max = score[i];
			}
			else if(score[i] < min){
				min = score[i];
			}
		}
		System.out.println("Max값은 "+max);
		System.out.println("Min값은 "+min);
		
	}
}
