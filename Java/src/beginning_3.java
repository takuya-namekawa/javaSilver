//税込み金額を計算するプログラム

class Tax {
	private double tax;
	private int unitPrice;
	private int amount;
	private static int totalTax;
	
	
	Tax(double tax, int unitPrice, int amount) {
		this.tax = tax;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}
	
	public static int totalTax(double tax, int unitPrice, int amount) {
		int price = unitPrice * amount;
		double conTax = price * tax;
		totalTax = (int) (price + (conTax));
		return totalTax;
	}
}

public class beginning_3 {

	public static void main(String[] args) {
		System.out.println("税込み金額は" + Tax.totalTax(0.1, 98, 3) + "円です");	
	}

}
