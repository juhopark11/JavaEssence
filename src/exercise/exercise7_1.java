//package exercise;
//
//// 실행결과  :  1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10, 
//class SutdaDeck {
//	final int CARD_NUM = 20;
//	SutdaCard2[] cards = new SutdaCard2[CARD_NUM]; // 배열만 생성. 객체생성이 아님.
//
//	SutdaDeck() {
//
//		for (int i = 0; i < cards.length; i++) {
//			int num = i%10+1;
//			boolean is = (i == 1 || i == 3 || i == 8);
//			cards[i] = new SutdaCard2(num, is);
//		}
//
//	}
//}
//
//class SutdaCard2 {
//	int num;
//	boolean isKwang;
//
//	SutdaCard2() {
//		this(1, true);
//	}
//
//	SutdaCard2(int num, boolean isKwang) {
//		this.num = num;
//		this.isKwang = isKwang;
//	}
//
//// info() Object toString() . 대신 클래스의 을 오버라이딩했다
//	public String toString() {
//		return num + (isKwang ? "K" : "");
//	}
//}
//
//class exercise7_1 {
//	public static void main(String args[]) {
//		SutdaDeck deck = new SutdaDeck();
//		for (int i = 0; i < deck.cards.length; i++)
//			System.out.print(deck.cards[i] + ",");
//	}
//}
