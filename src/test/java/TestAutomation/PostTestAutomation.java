package TestAutomation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class PostTestAutomation {
	@Test
    public void givenValidURLAndPayload_whenPost_ThenSuccess() throws IOException {
		URL url = new URL("https://api.github.com/users/google"); 
		HttpURLConnection con = (HttpURLConnection) url.openConnection(); 
		con.setRequestMethod("GET"); 
		InputStreamReader reader = new InputStreamReader(con.getInputStream());
		BufferedReader in = new BufferedReader(reader); 
		// in(this).inputstreamreader = inputstream;
		String inputLine; 
		//readLine() Method is used to Read a line of text (complete text) from each and every Line.
		while ((inputLine = in.readLine()) != null) {
		System.out.println(inputLine); 
		} 
		in.close(); 
		
	} 

		
}

