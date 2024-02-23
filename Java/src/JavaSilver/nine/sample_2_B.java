package JavaSilver.nine;

import java.util.Comparator;

public class sample_2_B implements Comparator<sample_2_A>{
	@Override
	public int compare(sample_2_A a1, sample_2_A a2) {
		if (a1.getId() < a2.getId()) {
			return 1;
		}
		if (a2.getId() < a1.getId()) {
			return -1;
		}
		
		return 0;
	}
}
