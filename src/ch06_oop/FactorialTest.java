package ch06_oop;


public class FactorialTest {

	public static void main(String[] args) {
		int result = factorial(4);

		System.out.println(result);
	}

	static int factorial(int n) {
		int result =0; // 지역변수는 기본적으로 초기화 하고써야 함. 

		if(n==1)
			result =1;
		else
			result=n*factorial(n-1); //다시 자신을 호출
		//  resunt=3*factorial(3-1);

		return result;
	}

}