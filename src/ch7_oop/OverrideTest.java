package ch7_oop;

class Point{
	int x; 
	int y; 
	String getLocation() {
		return "x:"+x+", y:"+y; 
	}
}

class Point3D extends Point{
	int z;
	
//	조상의 getLocation()을 overriding
	String getLocation() {
		return  "x:"+x+", y:"+y+" z:"+z; 
	}
}

public class OverrideTest {

	public static void main(String[] args) {

		
	Point3D p = new Point3D();
	p.x = 3;
	p.y = 5;
	p.z = 7;
	System.out.println(p.getLocation()); // getLocation 두개중에 overriding된거(자손꺼)가 호출됨.

	// 즉, 상속 받아서 내용을 내 맘대로 바꿀 수 있다. 그게 오버라이딩.
		
	}
}
