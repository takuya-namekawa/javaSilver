package JavaSilver.five;

public class sample_9 {
	
	//クラス内部でAという名前のインターフェースが定義されています。インターフェースは、
	//実装するクラスにメソッドの実装を強制するためのものです。
	//このコードでは、Aインターフェースは何もメソッドを持っていませんが、
	//他のクラスに対して何かしらの制約を与えるために使用されます。
	public static interface A {}
	
	
	//さらに、Bという名前の抽象クラスが定義されています。
	//抽象クラスは、インスタンスを直接作成することはできず、他のクラスに継承されるためのクラスです。
	//このコードでは、BクラスがAインターフェースを実装しています。
	//つまり、Bクラスを継承するクラスは、Aインターフェースで定義されているメソッドを実装する必要があります。
	public static abstract class B implements A {}
	
	public static class C extends B {}
	
	public static class D extends C {}
	
	public class Main {
		public static void main(String[] args) {
			A[] array = {new C(), null, new D()};
			Object[] objArray = array;
		}
	}
	
}
