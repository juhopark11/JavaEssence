package tmp;

public class array4 {

	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20}, 
				{30, 30, 30},
				{40, 40, 40}
		};

		int sum =0; 

		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[j].length; j++) { //score[0].length로 해도 됨.
				System.out.printf("[%d][%d]는 %d%n", i, j, score[i][j]);
				sum += score[i][j];
			}
		}
		System.out.println("sum="+sum);
	}
}