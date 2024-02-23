package JavaSilver.nine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sample_2_Main {

	public static void main(String[] args) {
		sample_2_A[] samples = { 
				new sample_2_A(2,"B"), 
				new sample_2_A(3,"C"),
				new sample_2_A(1,"A")
		};
		
		List<sample_2_A> list = new ArrayList<sample_2_A>(Arrays.asList(samples));
		list.sort(new sample_2_B());
		for (sample_2_A s : list) {
			System.out.println(s.getName());
		}

	}

}
