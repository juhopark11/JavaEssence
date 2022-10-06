package ch06_oop;

class Data { int x; }

class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
	 	d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(int x) {  // ±âº»Çü ¸Å°³º¯¼ö
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}


// 기본형 매개변수: 특정 값을 직접 저장, readonly ex) int, long, double, boolean, char, short, byte, float
// 참조형 매개변수: 객체의 주소를 저장, read&write ex) String, int[], Hero(메소드명).. 
// 결정요소 : "워드"(32bit,64bit)에 담을 수 있으면 기본형, 못담으면 참조형
