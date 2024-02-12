package JavaSilver.seven;
//子
public class sample_21_B extends sample_21_A{
	public sample_21_B() {
		super("B");
		System.out.println("C");
	}
	
	public sample_21_B(String val) {
		this();
		System.out.println(val);
	}
}
