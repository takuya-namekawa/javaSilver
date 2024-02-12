package JavaSilver.two;

public class sample_10 {
//Javaの文字列は不変(immutable)なので、一度作成された文字列は変更することができません。
//したがって、msg.replaceAll("hoge", "hello")という行の結果をmsg変数に再度代入しても、元のmsg変数には影響しません。
	public static void main(String[] args) {
		String str = "hoge, world";
		hello(str);
		
		System.out.println(str);

	}
	
	private static void hello(String msg) {
		msg.replaceAll("hoge", "hello");
	}
	
	
//replaceAllメソッドの結果を別の変数に代入することで、変換後の文字列を取得することができます。
//	public static void main(String[] args) {
//	    String str = "hoge, world";
//	    str = hello(str);
//	    System.out.println(str);
//	}
//
//	private static String hello(String msg) {
//	    return msg.replaceAll("hoge", "hello");
//	}

}
