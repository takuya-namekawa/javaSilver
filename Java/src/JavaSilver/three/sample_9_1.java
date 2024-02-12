package JavaSilver.three;

public class sample_9_1 {
	private int num;
	private String name;
	
	public sample_9_1(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (obj instanceof sample_9_1) {
			sample_9_1 s = (sample_9_1) obj;
			return s.num == this.num;
		}
		return false;
	}
}
