import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewFileMethods {
	public static void main(String[] args) throws IOException {
		//writeString(): This is to write some content in a file.
		Files.writeString(Path.of("File.txt"), "I am wrinting into file");
		String s= Files.readString(Path.of("File.txt"));
		System.out.println(s);
		
		System.out.println(Files.isSameFile(Path.of("File.txt"), Path.of("File.txt")));
		System.out.println(Files.readString(Path.of(".project")));
;
		
	}
}
