import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.ExecutionException;

public class HttpClientExample {
	
	HttpClient client = HttpClient.newHttpClient();
	HttpRequest request = null;
	
	public HttpClientExample() {

		try {
			request = HttpRequest.newBuilder()
			.uri(new URI("https://postman-echo.com/get"))
			  .headers("Content-Type", "text/plain;charset=UTF-8")
			  // .POST(HttpRequest.BodyPublishers.ofString("Sample request body"))
			  .GET()
			  .build();
		} catch (URISyntaxException e) { e.printStackTrace(); }
	}
	
	public String doTheRequest() {
		HttpResponse<String> response = null;
		try {
			response = client.send(request, BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) { e.printStackTrace(); }
		
		return response.body();
	}
	
	public String doTheAsyncRequest() {
		try {
		client.sendAsync(request, BodyHandlers.ofString())
			.thenApply(httpRes -> httpRes.body())
			.thenAccept(httpBody -> System.out.println(httpBody))
			.get();
		} catch (InterruptedException | ExecutionException e) { e.printStackTrace(); }
		
		return "";
		
	}
	
}
