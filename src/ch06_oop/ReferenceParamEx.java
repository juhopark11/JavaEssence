

package ch06_oop;

class ReferenceParamEx {
	public static void main(String[] args) {

		
		Data d = new Data();
		d.x = 10; 
		System.out.println("main() : x = " + d.x);

		change(d);
		System.out.println("Afer Change(d)");
		System.out.println("main() : x = " + d.x);

	}

	static void change(Data d) {
		d.x = 1000;
		System.out.println("change의 x = " + d.x);
	}
}
