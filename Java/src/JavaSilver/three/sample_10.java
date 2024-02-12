package JavaSilver.three;

public class sample_10 {

	public static void main(String[] args) {
		sample_10_1 s1 = new sample_10_1(10);
		sample_10_1 s2 = new sample_10_1(10);
		
		System.out.println(s1.equals(s2));
		
		//false
		System.out.println(s1 == s2);
		
		//Object型の入れ物にsampleのインスタンスを入れている　座標はオブジェクトのメモリを参照
		Object o1 = new sample_10_1(10);
		Object o2 = new sample_10_1(10);
		
		//false
		System.out.println(o1.equals(o2));
	}

}
