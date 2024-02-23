package JavaSilver.nine;

import java.time.LocalDate;

public class sample_5 {

	public static void main(String[] args) {
		LocalDate a = LocalDate.of(2015, 12, 1);
		System.out.println(a);
		LocalDate b = LocalDate.parse("2015-01-01");
		System.out.println(b);

	}

}
