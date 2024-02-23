package JavaSilver.nine;
/*Iteratorは、Javaのコレクションクラス（List、Set、Mapなど）に対して、要素を順番に取得するためのインターフェースです。
 * Iteratorを使用することで、要素を安全に取得したり、削除したりすることができます。
 * Iteratorには以下の主要なメソッドがあります。
 * boolean hasNext()：次の要素が存在するかどうかを判定します。次の要素がある場合はtrueを返し、ない場合はfalseを返します。
 * E next()：次の要素を返します。次の要素がない場合はNoSuchElementExceptionがスローされます。
 * void remove()：最後に返された要素を削除します。このメソッドを呼び出す前に、必ずnext()メソッドで要素を取得してください。また、同じ要素を複数回削除しようとすると、IllegalStateExceptionがスローされます。
 * 
 *Iteratorを使用する際の一般的な使用方法は、以下のようです 
 * コレクションからIteratorオブジェクトを取得します。この操作は、iterator()メソッドを呼び出すことで行います。
 * hasNext()メソッドを使用して、次の要素が存在するかどうかを確認します。
 * next()メソッドを呼び出して、次の要素を取得します。
 * 取得した要素を使用して任意の処理を行います。
 * 必要な場合は、remove()メソッドを呼び出して要素を削除します。
 * */
import java.util.ArrayList;
import java.util.Iterator;

public class sample_13_EXTRA {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			if ("C".equals(str)) {
				iterator.remove();
			}
		}
		System.out.println(list);

	}

}
