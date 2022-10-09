package tmp;

class dan{
	void add( int x, int y) { //int 타입으로, 호출한 곳에 반환해라.
		float result =0f;
		if(x>1) {
			return;
		}
		result = (float)x/y;
		result = result * 1000 ;
		System.out.println(result);
		
		
	}
}

public class oop {
	public static void main(String[] args) {
		
		dan d = new dan();
		d.add(3, 2);
		
//		int result = d.add(3, 2); // 함수 호출하고, 그 결과를 result에 저장.
//		System.out.println(result);
	}
}

/*
메서드의 실행흐름. 
1. 객체생성 2. 메서드 호출 3. 

return 하면 자기를 호출한 곳으로 되돌아감. 
void면 생략 가능하다, void가 아니면 "반드시" 필요함. 반환한다고 이미 선언했기 때문.


*/