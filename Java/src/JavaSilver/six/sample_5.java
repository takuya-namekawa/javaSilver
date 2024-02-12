package JavaSilver.six;

public class sample_5 {	
	
	public static void main(String[] args) {
		sample_5_1.num = 10;
		
		System.out.println(sample_5_1.num);  //デバッグ用出力　結果10が出力される
		
		sample_5_1 s = new sample_5_1();  //オブジェクトを作成
		sample_5_1 s2 = new sample_5_1();  //オブジェクトを作成
		
		s.num += 10;     
		
		System.out.println(sample_5_1.num); //デバッグ用出力　上記のnumへ加算しているから20が出力される
		
		s2.num = 30;
		
		System.out.println(sample_5_1.num); //デバッグ用出力　上記のnumへ再代入しているため30が出力される
		

	}

}
