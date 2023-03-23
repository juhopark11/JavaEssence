package tmp;

abstract class Unit2{
	int x, y; 
	abstract void move(int x, int y); // 몸통 없으니깐 abstract 붙여줌.
	void stop() { System.out.println("Stop");} // 몸통 있으니깐 생략 
}

interface Fightable{
	void move(int x, int y);
	void attack(Fightable f); //참조변수는 본인을 구현해주는(몸통만들어주는) 애만 들어오게 됨.
}

class Fighter extends Unit2 implements Fightable{
	 
	public void move(int x, int y) { // 오버라이딩 시 조상보다 좁으면 안됨. 
		System.out.println("move to : "+x+","+y);
	}
	public void attack(Fightable f) {
		System.out.println("attack : "+f);
	}
}


public class FighterTest {
	public static void main(String[] args) {
		
	
	Unit2 f = new Fighter();
	f.move(100, 300);
	f.stop();
	}
}
