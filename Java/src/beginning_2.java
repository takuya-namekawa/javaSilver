
public class beginning_2 {

	public static void main(String[] args) {
		//60円以上になるまで投入できる
		int total;
		total = 0;
		
		System.out.println("現在の金額は" + total + "円です");
		System.out.println("10円硬貨を一枚ずつ投入します");
		
		do {
			total += 10;
		} while (total < 60);
		
		System.out.println("合計金額は" + total + "円です" );

	}

}
