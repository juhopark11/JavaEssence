package ch08_except;

public class ExceptionEx7 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
//			System.out.println(args[0]);
			System.out.println(4);
		} 
		catch(ArithmeticException ae) {
			if(ae instanceof ArithmeticException)
			ae.printStackTrace();
			System.out.println("getMessage : "+ae.getMessage());
		} 
		catch(Exception e) {
			System.ou  t.println("Exception"+e.getMessage()); //exception의 최고조상. 
		}
		System.out.println(6);
	}
}
 