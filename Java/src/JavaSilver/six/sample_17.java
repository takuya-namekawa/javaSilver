package JavaSilver.six;

public class sample_17 {

	public static void main(String[] args) {
		sample_17 s = new sample_17();
		System.out.println(s.calc(2, 3));

	}
	
	private double calc(double a, int b) {
		return (a + b) / 2;
	}
//	calcをオーバーロードしているが、引数があいまいでコンパイルエラーになる　引数をどちらもint doubleなどに変更するとコンパイルエラーにはならない
//	private double calc(int a, double b) {
//		return (a + b) / 2;
//	}

}
