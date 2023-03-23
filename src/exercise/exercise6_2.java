package exercise;

//문제 6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 실행
//결과와 같은 결과를 얻도록 하시오
//3
//1K

public class exercise6_2 {
	public static void main(String args[]) {
		SutdaCard1 card1 = new SutdaCard1(3, false);
		SutdaCard1 card2 = new SutdaCard1();
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class SutdaCard1 {

	int num;
	boolean isKwang;
	SutdaCard1() {
	this(1, true); // SutdaCard(1, true) . 를 호출한다
	}
	SutdaCard1(int num, boolean isKwang) {
	this.num = num;
	this.isKwang = isKwang;
	}
	String info() { // . ( ) K . 숫자를 문자열로 반환한다 광 인 경우 를 덧붙인다 光
	return num + ( isKwang? "K" : "");
	}

}
