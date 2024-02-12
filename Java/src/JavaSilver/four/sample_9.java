package JavaSilver.four;

public class sample_9 {
	public static void main(String[] args) {
		int array[][] = new int[][] {{ 1,2 }, { 2,3,4 }};
		int total = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("外側の繰り返し" + i);
		
			for (int j = i; j < array[i].length; j++) {
				
				total += array[i][j];
				System.out.println("内側の繰り返し" + j);

//				System.out.println("array[i][j]は" + array[i][j]);
//				System.out.println("現在は" + j + "回目の繰り返し");
//			    System.out.println("array[i]の値は" + array[i].length);
			
			}
		}
		System.out.println(total);
	
	}
}
