package JavaSilver.seven;
//抽象クラス
abstract class sample_9_A {
	public void sample() {
		System.out.println("A");
		test();
		System.out.println("C");
	}
	
	protected abstract void test(); //抽象メソッド このメソッドは継承元で実装しなければいけない
}
