package JavaSilver.six;

public class sample_22 {

	public static void main(String[] args) {
		
		System.out.println(sample_22_1.num);  //この段階ではコンストラクタを呼んでいないためnumは初期値の0
		
		sample_22_1 s = new sample_22_1();
		System.out.println(s.num);  //ここで初期化が呼ばれた後コンストラクタが呼ばれるため、 num = 10 ->  num = 100となりnumに100が代入される
		
		
		
		System.out.println(sample_22_1.num); //代入されている値は100のため、100が代入される
		
	
	}

}
