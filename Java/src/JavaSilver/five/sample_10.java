package JavaSilver.five;

public class sample_10 {

	public static void main(String[] args) {
		int[][] arrayA = {{1, 2}, {1, 2}, {1, 2, 3}};
		int[][] arrayB = arrayA.clone();
		int total = 0;
		int num = arrayA[0][0] + arrayA[0][1];
		System.out.println("numの値は" + num);
		
		for (int[] tmp : arrayB) {
			for (int val : tmp) {
				total += val; 
				System.out.println(total);
			}
			
		}
		System.out.println(total);

	}

}
