package JavaSilver.nine;

import java.util.Arrays;

public class sample_16 {

	public static void main(String[] args) {
		String[] a = {"B", "A"};
		String[] b = {"A", "B"};
		System.out.println("辞書順に並べた時、先頭が間違っている場合は" + Arrays.compare(a, b));
		
		String[] c = {"A", "B"};
		String[] d = {"B", "A"};
		System.out.println("辞書順に並べた時後方が間違っている場合は" + Arrays.compare(c, d));
		
		String[] e = {"A", "B"};
		String[] f = {"A", "B"};
		System.out.println("辞書順に並べた時一緒だった場合は" + Arrays.compare(e, f));

	}

}
