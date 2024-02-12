package JavaSilver.three;

public class sample_10_1 {
	private int num;
	
	public sample_10_1(int num) {
		this.num = num;
	}
	
	public boolean equals(sample_10_1 obj) {
		if (obj == null) {
			return false;
		}
		
		return this.num == obj.num;
	}
	
	
}
