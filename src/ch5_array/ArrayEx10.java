package ch5_array;

public class ArrayEx10 {

	public static void main(String[] args) {
		
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i+1;

//			System.out.println(numArr[i]);
		}
				
		for(int i=0; i < 10; i++) {
			int n = (int)(Math.random()*10);
			int tmp = numArr[0];
				numArr[0] = numArr[n];
				numArr[n] = tmp;
				
		System.out.println("중복제거"+numArr[i]);
		}
		
		
		for(int i=0; i<numArr.length-1; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지를 체크한다. 
			
			for(int j=0; j < numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {
					int tmp = numArr[j+1];
						numArr[j] = tmp; 
						numArr[j+1] = tmp;
						changed = true;   
				}
			}
		
			if(!changed) break; // 만약 자리바꿈이 없으면 중단한다.
		}
		
		for(int k=0; k<nu                                                                                                  mArr.length; k++) {
			System.out.println(numArr[k]);
		}
		
}
	}

