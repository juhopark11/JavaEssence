package ch06_oop;

public class MyMath2 {
	long a, b; // iv의 진짜 이름은 this.a, this.b; 
	
	MyMath2(int a, int b){
		this.a = a; 
		this.b = b; 
	}
	long add() { //this. 는 인스턴스메서드에서만 사용가능.
		return  a+b; // 진짜 이름은 return this.a + this.b;
	}
	static long add(long a, long b) {
		return a+b; //lv니깐 여기는 this 필요 없음.
					// static은 iv 사용불가. 그래서 this도 사용불가. 
	}
}
