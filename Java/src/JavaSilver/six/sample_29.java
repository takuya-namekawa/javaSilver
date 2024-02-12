package JavaSilver.six;

public class sample_29 {
	private static void modify(int num) {
		num *= 2;
		System.out.println("modifyの中で出力を定義する" + num);
	}
	
	private static int mod(int num) {
		return num *= 2;
	}

	public static void main(String[] args) {
		
		sample29_1 s = new sample29_1(10);
		modify(s.num);
		
		System.out.println("modifyを呼んでフィールドを呼び出すと" + s.num);
		
		System.out.println("------");
		
		System.out.println(mod(s.num));

	}
	
	
}
