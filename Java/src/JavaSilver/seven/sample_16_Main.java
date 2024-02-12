package JavaSilver.seven;

public class sample_16_Main {

	public static void main(String[] args) {
		sample_16_A a = new sample_16_B(); //アップキャスト
		sample_16_B b = (sample_16_B) a; //ダウンキャスト
		b.hello();
		
	}
}
