package exercise;
/**
1. : shuffle 메서드명
기 능 배열 에 담긴 카드의 위치를 뒤섞는다 사용 : cards .(Math.random() )
반환타입 없음 :
매개변수 없음 :
2. : pick 메서드명
기 능 배열 에서 지정된 위치의 를 반환한다 : cards SutdaCard3 .
반환타입 : SutdaCard3
매개변수 위치 : int index -
3. : pick 메서드명
기 능 배열 에서 임의의 위치의 를 반환한다 사용 : cards SutdaCard3 .(Math.random() )
반환타입 : SutdaCard3
매개변수 없음
**/
class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard3[] cards = new SutdaCard3[CARD_NUM];

	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			int num = i;
			boolean isKwang = (num==1||num==3||num==8);
			cards[i] = new SutdaCard3(num, isKwang);
		}
	}

	void shuffle(){
		for(int i=0; i<cards.length; i++) {
			int j = (int)(Math.random()*cards.length); //Math.random은 묶어줘야 함.
			SutdaCard3 tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	SutdaCard3 pick(int index) {
		return new  SutdaCard3();
	}
	
	SutdaCard3 pick() {
		return new SutdaCard3();		
	}
	
	 
	
} // SutdaDeck

class SutdaCard3 {
	int num;
	boolean isKwang;

	SutdaCard3() {
		this(1, true);
	}

	SutdaCard3(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {

		return num + (isKwang ? "K" : "");
	}
}

class Exercise7_2 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();

		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();

		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");

		System.out.println();
		System.out.println(deck.pick(0));
	}
}