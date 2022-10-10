package ch06_oop;

public class ReturnTest {

	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();
		
		int result = r.add(3,5);
		System.out.println(result);
		
		int[] result2 = {0}; //배열을 생성하고 값을 0으로 초기화
		r.add(3,5,result2);  //배열을 add메서드의 매개변수로 전달
		// 즉, 반환값이 없어도 실행결과를 볼 수 있다. 왜냐면 참조형이라서 result2에는 값을 넣어놨기 때문. 
		// 반환값 없는 void의 경우 void 내에서 sysout 해주거나 해야 함. 
		// void에서 참조형 주소에다가 값을 저장해놨기 때문에 여기서 sysout으로 볼 수가 있음.
		System.out.println(result2[0]); 
	}
	
	int add(int x, int y) {
		return x+y; 
	}
	
	void add(int x, int y, int[] result) {
		result[0] = x+y;
	}

}
