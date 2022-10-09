package exercise;

import java.util.Arrays;

public class exercise5_5 {

	/*
	  [5-5] 다음은 과 사이의 중복되지 않은 숫자로 이루어진 자리 숫자를 만들어내는 프로그램이다. 
	  (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
	 */

	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		// ballArr . 배열 의 임의의 요소를 골라서 위치를 바꾼다
		for(int i=0; i< ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3 로 복사한다
		/* (2) */
		ball3 = Arrays.copyOf(ballArr, 3);
		
		for(int i=0;i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}
	} // end of main
}


/*
Arrays.copyOf : 새로운 배열 생성 가능, 전부 복사하거나 복사 대상의 객체를 유지시킬 필요가 없을 때 사용 추천.
System.arraycopy() : 복사 길이를 명시해야 하거나, 객체를 유지하고자 할 때 사용 추천.
스택오버플로우 여기 답변들을 보면 Arrays.copyOf가 2배가량 빠르다고 한다.
*/