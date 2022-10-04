package ch7_oop;


public class MyParent{
	  private int prv; // 같은 클래스만 가능. 
			  int dft; // 같은 패키지, 클래스만 가능 (default)
	protected int prt; // 같은 패키지, 클래스, 자손(다른패키지도) 가능 
	   public int pub; // 전체 가능.
	   
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
	
}

 class MyParentTest {

	public static void main(String[] args) {
		
		MyParent p  = new MyParent();
		
//		System.out.println(p.prv); //에러. Myparent 안에서만 가능해서// 그래서 Getter/Setter를 써야함.
		System.out.println(p.dft);	
		System.out.println(p.prt);
		System.out.println(p.pub);
		
	}
}
