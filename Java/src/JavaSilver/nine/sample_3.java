package JavaSilver.nine;

import java.util.Arrays;
import java.util.List;

public class sample_3 {
	public static void main(String[] args) {
		//asListに関して -> ざっくり言うと「引数で指定した配列をリストとして返す」というメソッド。
		List<Integer> list = Arrays.asList(new Integer[] {1, 2, 3});
		
		list.sort((a, b) -> -a.compareTo(b));
		for (Integer num : list) {
			System.out.println(num);
		}
	}
}
