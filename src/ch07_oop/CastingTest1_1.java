package ch07_oop;

public class CastingTest1_1 {
	public static void main(String args[]) {
		Car car = null; 
//		FireEngine fe = null; //실제 인스턴스가 무엇인지가 중요. 안그럼 Exception 발생. 
		FireEngine fe = new FireEngine();
		
		FireEngine fe2 = (FireEngine)car; // 조상-> 자손타입으로 형변환
		Car car2 = (Car)fe2;				 // 자손-> 조상으로 형변환
//		car2.drive(); //NullPointerException 발생. 
		
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