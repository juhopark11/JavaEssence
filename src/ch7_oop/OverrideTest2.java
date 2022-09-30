package ch7_oop;

class MyPoint3 extends Object{
	int x; 
	int y; 
	
	//Object클래스의 toString()을 오버라이딩
	public String toString() { //toString에 public 이 붙는 조건으로 extends Object 없이 쓰도록 해줌.
		return  "111x:"+x+", y:"+y;
	}

public class OverrideTest2 {

	public static void main(String[] args) {
	
	MyPoint3 p = new MyPoint3();
	p.x = 3;
	p.y = 5;
	System.out.println(p.toString());
	
	}
}

}