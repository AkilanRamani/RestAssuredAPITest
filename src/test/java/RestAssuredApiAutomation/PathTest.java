package RestAssuredApiAutomation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/RestAssuredAPITest/JSONFile/JSONRequest.json");
		System.out.println(path.getFileName());
		
		/*byte[] a = Files.readAllBytes(path);
        String a1 = new String(a);
        System.out.println(a1); */
		
		byte[] a = { 65,66,67};
		String a1 = new String(a);
		System.out.println(a1);
	}

}
