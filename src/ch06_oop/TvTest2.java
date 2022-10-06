package ch06_oop;

class Tv { 
    // Tv의 속성(멤버변수) 
    String color;          // 색상 
    boolean power;         // 전원상태(on/off) 
    int channel;           // 채널 

    // Tv의 기능(메서드) 
    void power()   { power = !power; }  // TV를 켜거나 끄는 기능을 하는 메서드 
    void channelUp()   {  ++channel; }  // TV의 채널을 높이는 기능을 하는 메서드 
    void channelDown() {  --channel; }  // TV의 채널을 낮추는 기능을 하는 메서드 
}

class TvTest2 {
	public static void main(String args[]) {
		Tv t1 = new Tv();  // Tv t1; t1 = new Tv();를 한 문장으로 가능
		Tv t2 = new Tv();
		// t2 = t1; 
		// 위와같이 넣으면 t2는 t1 주소를 바라보게 됨. 즉, 결과값이 동일하게 됨 
		// 안쓰게된 t2 메모리영역을 가비지컬렉터에 의해 없어짐(자동 메모리 관리)
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

		t1.channel = 7;	// channel 값을 7으로 한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");

		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	
	}
}

