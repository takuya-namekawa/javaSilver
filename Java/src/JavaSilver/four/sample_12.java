package JavaSilver.four;

public class sample_12 {

	public static void main(String[] args) {
		String[] array = {"A", "B", "C"};
		for (String str : array ) {
			str = "D";
		}
		
		for (String str : array ) {
			System.out.println(str);
		}

	}

}
