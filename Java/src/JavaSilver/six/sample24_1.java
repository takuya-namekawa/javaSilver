package JavaSilver.six;

public class sample24_1 {
	public sample24_1() {
	//これがコンパイルエラーになる例	System.out.println("a");
		this(null, 0);
	}
	
	public sample24_1(String str, int num) {
		System.out.println("OK.");
	}
}
