package ch5_array;

public class ArrayEx6 {

	public static void main(String[] args) {

		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i=0; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i]; 
			}
			else if(score[i] < min) {
				min = score[i];
			}
				
		}
		
		System.out.println("Max값은 : " +max);
		System.out.println("Min값은 : " +min);
		
	}
}
