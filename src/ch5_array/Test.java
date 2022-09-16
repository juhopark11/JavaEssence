package ch5_array;

public class Test {

	public static void main(String[] args) {
		
	int[] arr = {1, 2, 3, 4, 5}; 

	// 일반 for문 사용 시
	for(int i = 0; i<arr.length; i++){
		System.out.println(arr[i]); 
	}
	
	System.out.println("");


	// 향상된 for문 사용 시 
	for(int tmp : arr) {
	System.out.println(tmp);
	}
	
	}
}
