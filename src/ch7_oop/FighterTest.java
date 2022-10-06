package ch7_oop;

abstract class Unit{
	int x, y; 
	abstract void move(int x, int y);
	void stop() { System.out.println("멈춥니다.");}	
}

interface Fightable{
	
	void move(int x, int y);  //public abstract가 있으나 보이기에 생략됨. 
	void attack(Fightable f); //public abstract가 있으나 보이기에 생략됨. 
}


class Fighter extends Unit implements Fightable{
	public void move(int x, int y) { // 조상은 public abstract. 조상보다 접근제어자 좁으면 안되서 public 붙어야함. 
		System.out.println(x+","+y+"로 이동 ");
	} 
	public void attack(Fightable f) { // 위 주석과 동일한이유. 그냥 인터페이스 구현 메소드는 public을 붙이자.
		System.out.println(f+"를 공격 ");
	}
	Fightable getFightable(){ // 싸울 수 있는 상대를 불러온다.
		Fighter f = new Fighter(); // Fighter를 생성해서 반환 
		return f;
	}
	
}

public class FighterTest {

	public static void main(String[] args) {
		
		Fighter f = new Fighter();
		Fightable f2 = f.getFightable();
		f.move(3, 5);
		
	}
}
