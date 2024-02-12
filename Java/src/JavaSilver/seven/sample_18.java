package JavaSilver.seven;

public class sample_18 {
	private int num = 10;
	
	public sample_18(int num) {
		//通常の記述　this.num = num;
		setNum(num); //セッターを使用してコンストラクタに値をセットする事が可能
	}
	
	private void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}
