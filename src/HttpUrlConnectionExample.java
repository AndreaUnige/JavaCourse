import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class HttpUrlConnectionExample {
	
	private URL url = null;
	private HttpURLConnection con = null;
	
	
	public HttpUrlConnectionExample() {
		try {
			url = new URL("https://postman-echo.com/get");	
			con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
		} catch (IOException e)  { e.printStackTrace(); }
		
		
		
	}
	
	public String doTheRequest (HashMap<String, String> params) {
		addParams(params);
		addHeaders();
		
		return doTheRequest();
	}
	
	
	private void addParams(HashMap<String, String> params)  {
		if (params == null)
				return;
		
		con.setDoOutput(true);
		
		try {
			DataOutputStream out = new DataOutputStream(con.getOutputStream());
			out.writeBytes(formatParams(params));
			out.flush();
			out.close();
		} catch (IOException e)  { e.printStackTrace(); }
	}
	
	private String formatParams(HashMap<String, String> params) {
		StringBuilder result = new StringBuilder();

        for (Map.Entry<String, String> entry : params.entrySet()) {
        	try {
        	result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
        	result.append("=");
			result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
		} catch (UnsupportedEncodingException e) { e.printStackTrace(); }
          result.append("&");
        }

        String resultString = result.toString();
        
        return resultString;
	}
	
	
	private void addHeaders() {
		con.setRequestProperty("Content-Type", "application/json");
	}
	
	private String doTheRequest() {
		StringBuffer content = null;
		try {
			int status = con.getResponseCode();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
		
			in.close();
			con.disconnect();
		} catch (IOException e) { e.printStackTrace(); }
		
		return content.toString();
	}
		
		
}
