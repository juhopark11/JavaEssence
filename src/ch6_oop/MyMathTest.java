package ch6_oop;

class MyMathTest {
	public static void main(String args[]) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		long result5 = mm.Max(5L, 3L);
		long result6 = mm.min(5L, 3L);
		mm.printGugudan(9); 
		System.out.println("add(5L, 3L) = "      + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = "   + result4);
		System.out.println("Max(5L, 3L) = "   + result5);
		System.out.println("Max(5L, 3L) = "   + result6);
	}
}

class MyMath {
	
	void printGugudan(int dan) {
		if(!(2<=dan && 9>=dan)) {
			return; // 2~9단 사이가 아니면, 메소드 종료하고 돌아가기
		}
		for(int i=1; i<9; i++) {
			System.out.printf("%d * %d = %d%n", dan,i, dan*i);
		}
		return ; 
	}
	
	long add(long a, long b) {
		long result = a+b;
		return result;
	//	return a + b;	// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}

	long subtract(long a, long b) {
		return a - b;
	}

	long multiply(long a, long b) {
		return a * b;
	}

	double divide(double a, double b) {

		return a / b;
	}
	
	long Max(long a, long b) {
	
		return  a > b ? a : b; // 삼항연산   조건식 ? True값 : False값;  		
	}
	
	long min(long a, long b) {
		long result=0 ; 
		if(a>b) {
			result = b; 
		}
		if(a<b) {
			result = a; 
		}
		return result;
	}
}
