package JavaSilver.nine;

import java.util.List;

public class sample_18 {

	public static void main(String[] args) {
		List<String> list = List.of("A", "B", "C");
		list.forEach(str -> System.out.println(str));
		
		list.forEach(System.out::println); //メソッド参照

	}

}
