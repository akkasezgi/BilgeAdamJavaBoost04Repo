
import java.io.FileReader;


public class ReadAFile {

	public static void main(String[] args) {

		char[] array = new char[100];

		try {
			FileReader input = new FileReader("newFile.txt");

			input.read(array);

			System.out.println("data in the file: " + array);
			System.out.println(array);
			input.close();

		} catch (Exception e) {

			e.getStackTrace();
		}

	}

}
