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


