package exercise;

import java.util.Arrays;

public class exercise5_5 {

	/*
	 * [5-5] 다음은 과 사이의 중복되지 않은 숫자로 이루어진 자리 숫자를 만들어내는 프로그램이다. 
     * (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
  	 */

	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		// ballArr . 배열 의 임의의 요소를 골라서 위치를 바꾼다
		
		for(int i=0; i< ballArr.length;i++) {
		int j = (int)(Math.random() * ballArr.length); //ballArr중 한 값을 임의로 얻는다.
		int tmp = 0;
		
		//2개 수를 맞바꾸기 위해 tmp(빈그릇) 하나 두고 맞바꾸는 작업. 
		tmp = ballArr[i]; //0을 tmp에 저장해놓는다. 
		ballArr[i]=ballArr[j]; //random이 4라면, 4를 0 자리에 넣는다. 
		ballArr[j]=tmp; // 0을 자 자리에 넣는다. 
		}
			
		System.out.println(Arrays.toString(ballArr));
		System.arraycopy(ballArr, 0, ball3, 0, 3);

		

		for(int i=0;i<ball3.length;i++) {
		System.out.print(ball3[i]);
		}
	}	
}

