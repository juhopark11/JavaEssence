package ch05_array;

public class ArrayEx08 {

	public static void main(String[] args) {
	
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
//			ball[i] =  (int)(Math.random()*45);
			System.out.println(Math.random());
		}
	}

}
