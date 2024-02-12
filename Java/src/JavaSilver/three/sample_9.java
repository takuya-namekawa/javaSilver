package JavaSilver.three;

public class sample_9 {

	public static void main(String[] args) {
		sample_9_1 a = new sample_9_1(10, "aaa");
		sample_9_1 b = new sample_9_1(10, "aaa");
		
		System.out.println(a.equals(b));
	
//		このコードは、sample_9というクラスとsample_9_1というクラスを定義していますね。
//
//		sample_9のmainメソッドでは、sample_9_1のインスタンス2つ(aとb)を作成し、aとbが等しいかどうかを比較しています。
//
//		sample_9_1のequalsメソッドは、引数として渡されたオブジェクトが、sample_9_1クラスのインスタンスであり、かつnumフィールドの値が等しい場合にtrueを返します。
//
//		よって、aとbのnumの値はともに10なので、a.equals(b)はtrueとなります。
//
//		これらのコードの実行結果はtrueになります。

	}

}
