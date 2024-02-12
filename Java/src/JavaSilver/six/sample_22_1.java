package JavaSilver.six;

public class sample_22_1 {
	static int num;
	
	//二番目に初期化子が走る
	{
		num = 10;
	}
	//三番目に初期化子が走る
	public sample_22_1() {
		num = 100;
	}
	
	//staticは早い　順次処理を通り越して先に処理が走る
	static {
		num = 200;
	}
}
