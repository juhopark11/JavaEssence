package ch06_oop;

public class ReferenceParamEx2 {

	public static void main(String[] args) {
		
		int[] x = {10};
		System.out.println("main x= "+x[0]);
		
		change(x);
		System.out.println("After Change");
		System.out.println("main x= "+x[0]);
	}

	static void change(int[] x) {
		x[0] =100;
		System.out.println("change x= "+x[0]);
	}
}

// 임시적으로 간단히 처리할땐 클래스 안만들고 배열을 이용할 수 있다. 
