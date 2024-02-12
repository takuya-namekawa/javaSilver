package JavaSilver.eight;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public  class sample_5_Main {

	public static void main(String[] args) {
		List<sample_5_A> sampleList = Arrays.asList(
										new sample_5_A(10),
										new sample_5_A(20),
										new sample_5_A(30));
		//Pridicateを使用して条件分岐を作成
		Predicate<sample_5_A> PridecateList = (list) -> sampleList.contains(list); //リストが引数に指定したオブジェクトを含む場合、戻り値はtrueを返す
		if (PridecateList.test(new sample_5_A(20))) {
			System.out.println("OK.");
		}
	}

}
