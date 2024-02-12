package JavaSilver.six;

public class sample_30 {

	public static void main(String[] args) {
		sample_30_1 sample = new sample_30_1(10);
		modify(sample);
		System.out.println(sample.num);
		
		sample_30_1 s = new sample_30_1(55);
		
		modify(s);
		System.out.println(s.num);

	}
	
	private static void modify(sample_30_1 sam) {
		sam.num *= 2;
	}
	
	

}
