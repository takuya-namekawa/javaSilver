package JavaSilver.ten;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class sample_10 {

	public static void main(String[] args) {
		FileInputStream is = null;
		try  {
			is = new FileInputStream("sample.txt");
			throw new FileNotFoundException();
		} catch (Exception e) {
			System.out.println("A");
		} finally {
			try {
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				throw new RuntimeException();
			}
			
			System.out.println("B");
		}

	}

}
