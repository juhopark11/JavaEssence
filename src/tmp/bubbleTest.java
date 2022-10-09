package tmp;

import java.util.Arrays;

public class bubbleTest {

	public static void main(String[] args) {

		int[] arr = new int[10];

		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*60);
		}
		System.out.println("정렬전 "+Arrays.toString(arr)+"\n");
		
		for(int i=0; i<arr.length-1; i++) {
			boolean changed = false;
			
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= tmp;
					changed = true;
				}
			}
			System.out.println("정렬후 "+Arrays.toString(arr));
			if(!changed) break ;
			
			for(int k=0; k<arr.length; k++) {
//				System.out.println(arr[k]);
			}
		
//			System.out.println("최종  "+Arrays.toString(arr));
		}
	}
}
