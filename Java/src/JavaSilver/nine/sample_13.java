package JavaSilver.nine;

import java.util.ArrayList;

public class sample_13 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		for (String str : list) {
			if ("C".equals(str)) {
				list.remove(str);
			}
		}
		/* このエラーは、コレクション(ListやSetなど)を操作する中で、同時にその要素を変更しようとすると発生します。具体的には、for-eachループ内で要素を削除する場合によく発生します。 */
		/* java.util.ConcurrentModificationException */
		

	}

}
