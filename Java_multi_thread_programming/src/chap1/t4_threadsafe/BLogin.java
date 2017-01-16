package chap1.t4_threadsafe;

public class BLogin extends Thread {
	@Override
	public void run(){
		LoginServlet.doPost("a", "aa");
	}
}
