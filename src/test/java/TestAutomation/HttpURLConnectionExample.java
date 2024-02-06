package TestAutomation;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionExample {
	
	 private final String USER_AGENT = "Mozilla/5.0";
	 
	 public static void main(String[] args) throws Exception {
	 
	  HttpURLConnectionExample http = new HttpURLConnectionExample();
	 
	     // Sending get request
	  http.sendingGetRequest();
	 
	    // Sending post request
	  http.sendingPostRequest();
	 
	 }
	 
	 // HTTP GET request
	 private void sendingGetRequest() throws Exception {
	 
	  String urlString = "https://reqres.in/api/users/2";
	 
	  URL url = new URL(urlString);
	  HttpURLConnection con = (HttpURLConnection) url.openConnection();
	 
	  // By default it is GET request
	  con.setRequestMethod("GET");
	 
	  //add request header
	 con.setRequestProperty("User-Agent", USER_AGENT);
	 
	  int responseCode = con.getResponseCode();
	  System.out.println("Sending get request : "+ url);
	  System.out.println("Response code : "+ responseCode);
	 
	  // Reading response from input Stream
	  BufferedReader in = new BufferedReader(
	          new InputStreamReader(con.getInputStream()));
	  String output;
	  StringBuffer response = new StringBuffer();
	 
	  while ((output = in.readLine()) != null) {
	   response.append(output);
	  }
	  in.close();
	 
	  //printing result from response
	  System.out.println(response.toString());
	 
	 }
	 
	 // HTTP Post request
	 private void sendingPostRequest() throws Exception {
	 
	  String url = "https://reqres.in/api/users";
	  URL obj = new URL(url);
	  HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	 
	        // Setting basic post request
	  con.setRequestMethod("POST");
	  con.setRequestProperty("User-Agent", USER_AGENT);
	  con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
	  con.setRequestProperty("Content-Type","application/json");
	 
	  String postJsonData = "{\r\n"
	  		+ "    \"name\": \"morpheus\",\r\n"
	  		+ "    \"job\": \"leader\"\r\n"
	  		+ "}";
	 
	  // Send post request
	  con.setDoOutput(true);
	  OutputStream stream = con.getOutputStream(); // Returns an output stream that is needed to write .
	  System.out.println("The Stream data is " + stream.toString());
	  DataOutputStream wr = new DataOutputStream(stream);
	  //wr.stream = stream; 
	  wr.writeBytes(postJsonData); // which will write the String data into the Stream.
	  wr.flush();
	  wr.close();
	  //The Request Body will be sent as stream along with the Connection Request.
	  
	 
	  int responseCode = con.getResponseCode();
	  System.out.println("nSending 'POST' request to URL : " + url);
	  System.out.println("Post Data : " + postJsonData);
	  System.out.println("Response Code : " + responseCode);
	 
	  BufferedReader in = new BufferedReader(
	          new InputStreamReader(con.getInputStream()));
	  String output;
	  StringBuffer response = new StringBuffer();
	 
	  while ((output = in.readLine()) != null) {
	   response.append(output);
	  }
	  in.close();
	 
	  //printing result from response
	  System.out.println(response.toString());
	 }
	}


