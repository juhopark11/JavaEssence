package tmp;

import java.util.Arrays;

public class array1 {
	
	public static void main(String[] args) {
		
		int[] score = new int[5]; //1. 배열score를 선언(참조변수)
		System.out.println(score.length);
		for(int i=0; i < score.length; i++) {
			score[i] = i+1;
			System.out.println(score[i]);
		}
		
		int[] arr1 = {10, 20, 30, 40, 50};
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
	
		int[] arr2 = new int[5];
		for(int i=0; i < arr2.length; i++) {
			arr2[i] = (int)(Math.random()*60);
			System.out.println(arr2[i]);
		}
	}

//public static void main(String[] args) {

//	
//}

/*
  *배열은 같은 타입만 묶을 수 있다. 배열의 선언과 생성 배열의 선언 
  -배열을 다루기 위한 "참조변수"의 선언
  int[] arr = new int[3]; // 배열을 생성(실제 저장공간을 생성)  
  * 배열은 한번 생성하면 그 길이를 바꿀 수 없다. 
  즉, 배열이름.length - 배열의 길이(int형 상수)
  왜 못바꾸나?배열 공간은 연속이어야 하니까. 배열 앞뒤 공간이 있다는 보장이 없어서 불가. 
  부족하면? 새로운 배열에 복사해야 함. 
  * 배열의 초기화 : 배열의 각 요소에 처음으로 값을 저장하는 것.
  int[] score = {1, 2, 3, 4, 5}  이런 식으로 99% 씀.
  * 배열의 출력
  [I@75bd9247 int의 배열 @뒤에는 주소 즉, @~~에 있는 int의배열이다.
  단, char[] chArr = {'a', 'b', 'c', 'd'}; 의 경우
  주소가 아닌 캐릭터(문자)가 그대로 출력된다. 
  Arrays.toString(참조변수) 이렇게 하면 for문 없이 다 출력해줌. 
  즉, 배열의 내용을 문자열로 반환해줌. 
  
자바 컴파일러(javac) 기본적으로 1.구분체크 2.번역 3.최적화를 함.
Ctrl+Shift+L 단축키 전체목록
Alt+shift+A 멀티컬럼 편집
Ctrl+i 자동 들여쓰기
sysout System.out.println() 단축키 
*/

	
 
}