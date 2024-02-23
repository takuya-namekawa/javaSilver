package JavaSilver.nine;

import java.util.ArrayList;

public class sample_8 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>(); //オブジェクト型を左辺へ渡す
		list.add("A");
		list.add(10);
		list.add("B");
		
		for (Object obj : list) {
			System.out.print(obj);
		}

	}

}
