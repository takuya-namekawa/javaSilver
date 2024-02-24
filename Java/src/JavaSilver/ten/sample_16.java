package JavaSilver.ten;

public class sample_16 {

	public static void main(String[] args) {
		//nullを対象とする呼び出しを行うとNullPointerExceptionが発生する
		String str = null;
		//System.out.println(str);
		if (str.equals("")) {
			System.out.println("blank");
		} else {
			System.out.println("null");
		}

	}

}
