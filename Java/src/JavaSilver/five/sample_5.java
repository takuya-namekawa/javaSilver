package JavaSilver.five;



public class sample_5 {
	
	public static class Item {
		String name;
		int price = 100;
	}
	
	public static void main(String[] args) {
		Item[] items = new Item[3];
		
		//各要素を初期化する
		for (int i = 0; i < items.length; i++ ) {
			items[i] = new Item();
		}
		int total = 0;
		
		for (int i = 0; i < items.length; i++) {
			
			total += items[i].price;
		}
		System.out.println("Total:" + total);
	}

}
