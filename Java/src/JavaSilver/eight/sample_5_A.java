package JavaSilver.eight;

public class sample_5_A {
	private int num;
	public sample_5_A(int num) {
		this.num = num;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof sample_5_A == false) { //オブジェクトがsample_5_Aでなければfalseを返す
			return false;
		}
		if (this.num == ((sample_5_A) obj).num){ //フィールドの値を持っているのがsample_5_Aのオブジェクトのフィールドと一緒であればtrueを返す
			return true;
		}
		//それ以外はすべてfalseを返す
		return false;
	}
}
