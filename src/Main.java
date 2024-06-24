
public class Main {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		
		long start = System.currentTimeMillis();
		HttpUrlConnectionExample myHttp = new HttpUrlConnectionExample();
		String res = myHttp.doTheRequest(null);
		long stop = System.currentTimeMillis();
		
		System.out.println(res);
		System.out.println("Time: " + (float)(stop - start)/1000);
		System.out.println("*** END***\n\n");
		
		
		
		System.out.println("*** Start ***");
		start = System.currentTimeMillis();
		HttpClientExample myHttp1 = new HttpClientExample();
		res = myHttp1.doTheRequest();
		stop = System.currentTimeMillis();
		
		System.out.println(res);
		System.out.println("Time: " + (float)(stop - start)/1000);
		System.out.println("*** END***\n\n");

		
		
		
		
		
		
		System.out.println("*** Start ***");
		start = System.currentTimeMillis();
		HttpClientExample myHttp2 = new HttpClientExample();
		res = myHttp1.doTheAsyncRequest();
		stop = System.currentTimeMillis();
		
		System.out.println(res);
		System.out.println("Time: " + (float)(stop - start)/1000);
		System.out.println("*** END***\n\n");

		
	}

}
