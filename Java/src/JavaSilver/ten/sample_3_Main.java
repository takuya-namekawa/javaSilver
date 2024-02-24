package JavaSilver.ten;

public class sample_3_Main {

	public static void main(String[] args) {
		try {
			sample();
		    sub();
		    
		} catch (sample_3_B e) {
			System.out.println("B");
		} catch (sample_3_A e) {
			System.out.println("A");
		}	
		
	}
	//sample()メソッドは、sample_3_A例外をスローしています。
	private static void sample() throws sample_3_A{ //スーパークラス
		throw new sample_3_A();
	}
	//sub()メソッドは、sample_3_B例外をスローしています。
	private static void sub() throws sample_3_B { //サブクラス
		throw new sample_3_B();
	}
	

}
