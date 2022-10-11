package ch06_oop;

public class ReferenceReturnEx {

	public static void main(String[] args) {
		
	}
	
	
	static Data copy(Data d) {
		Data tmp= new Data();
		tmp.x = d.x;
		return tmp; 
	}
}

/*
this. 
 - 인스턴스 자신을 가리키는 참조변수
 - 인스턴스 메서드에서사용가능. 
 - 지역변수와 인스턴스변수를 구별할 때 사용
   (this.은 지역변수임.)
 -  

this(매개변수) 생성자
this. 객체 자신(인스턴스변수)를 가리키는 참조변수. 인스턴스의 주소가 저장되어있음.
모든 인스턴스메서드에 지역변수로 숨겨진 채 존재함. 

*/ 