package JavaSilver.ten;

public class sample_2 {

	public static void main(String[] args) {
		try {
			if (args.length == 0) {
				System.out.println("A");
			}
		} catch (NullPointerException e) {
			System.out.println("error");
		} finally {
			System.out.println("C");
		}

	}

}
