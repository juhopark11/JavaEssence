package exercise;
import ch07_oop.MyParent;

class MyChild extends MyParent{
	
	public void printMembers() {
//		System.out.println(prv); //private 에러
//		System.out.println(dft); //default 에러 
		System.out.println(prt);
		System.out.println(pub);
	}
}

	
public class MyparentTest2 {

	public static void main(String[] args) {
	
		MyParent p  = new MyParent();

//		System.out.println(p.prv); //에러. Myparent 안에서만 가능해서// 그래서 Getter/Setter를 써야함.
//		System.out.println(p.dft);	
//		System.out.println(p.prt);
		System.out.println(p.pub);
		
	}
}
