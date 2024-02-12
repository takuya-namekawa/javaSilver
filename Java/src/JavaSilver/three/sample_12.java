package JavaSilver.three;

public class sample_12 {

	public static void main(String[] args) {
		//普通の書き方で文字列を記述する場合は同じメモリを参照する
		String str = "test";
		String str2 = "test";
		
		System.out.println(str);
		System.out.println(str2);
		
		System.out.println(str == str2);
		
		System.out.println(str.equals(str2));

	}

}
