package JavaSilver.three;


public class sample_8 {

	public static void main(String[] args) {
		sample_8_1 s1 = new sample_8_1(10);
		sample_8_1 s2 = s1;
		System.out.println(s1);
		//JavaSilver.three.sample_8_1@24d46ca6
		System.out.println(s2);
		//JavaSilver.three.sample_8_1@24d46ca6
		
		s1 = new sample_8_1(10);
		
		System.out.println(s1);
		//JavaSilver.three.sample_8_1@4517d9a3
		
		System.out.println(s1 == s2);
		
		System.out.println("s1に入っている値" + s1.getNum());
		System.out.println("s2に入っている値" + s2.getNum());
		
		System.out.println(s1.getNum() == s2.getNum());
		
		s1 = new sample_8_1(10);
		System.out.println(s1);

	}

}
