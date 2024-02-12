package JavaSilver.seven;

public class sample_19_Main {

	public static void main(String[] args) {
		sample_19_B b = new sample_19_B();
		b.name = "sample";
		System.out.println(b.getName()); //Aのフィールドには何も値がセットされていない ゲッターに関してもAのゲッター
		System.out.println(b.name);

	}

}
