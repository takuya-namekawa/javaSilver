package JavaSilver.nine;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class sample_6 {

	public static void main(String[] args) {
		LocalDate a = LocalDate.of(2019, 8, 9);
		LocalDate b = LocalDate.now();
		
		b.with(DayOfWeek.MONDAY); //withを使用してデータを変更　月曜日に変更
		
		//aはbと同じ日付か? -> false  aはbよりも前の日付か? -> ture
		System.out.println(a.equals(b) + ", " + a.isBefore(b));

	}

}
