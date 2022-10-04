package ch7_oop;

public class CastingTest1 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe;    // car =(Car)fe;에서 형변환이 생략된 형태다.
//		car.water();	 // 이 타입으로는 water를 쓸 수 없음. car는 4개밖에 없으니깐.
		fe2 = (FireEngine)car; // 자손타입 ← 조상타입
		fe2.water();
	}
}

class Car {
	String color;
	int door;

	void drive() { 		// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() {		// 멈추는 기능	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// 소방차
	void water() {		// 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}