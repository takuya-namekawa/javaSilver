package JavaSilver.seven;

public class sample_6B implements sample_6A{
	@Override
	public void sample() {
		//インターフェイス名.super.メソッド名
		sample_6A.super.sample();
		System.out.println("Java");
	}
}
