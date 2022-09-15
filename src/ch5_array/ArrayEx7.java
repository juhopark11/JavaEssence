package ch5_array;

public class ArrayEx7 {

	public static void main(String[] args) {
		int[] numArr = new int[45]; // 45개의 정수값을 저장하기 위한 배열 생성.

		//배열의 각 요소에 1~45 값을 저장한다.
		for (int i=0; i < numArr.length ; i++ ) {
             numArr[i] = i+1;  // ball[0]에 1이 저장됨
//			System.out.print(" " + numArr[i]);  
			}
		
		int temp = 0; // 두 값을 바꾸는데 사용할 임시변수 
		int n = 0; 	 // 임의의 값을 얻어서 저장할 변수 
		
		for (int i=0; i < numArr.length; i++ ) { // 45번 섞는다. 
			n = (int)(Math.random() * numArr.length);	// 0~9중의 한 값을 임의로 얻는다.
			int tmp = numArr[0];  //Numarr[0]과 Numarr[n]을 서로 바꾸기 위해 tmp 이용
			numArr[0] = numArr[n];
			numArr[n] = tmp;	
		}
	
		for(int i=0; i<6; i++) {
			System.out.println("숫자: "+numArr[i]);
		}
	
	} 

}

