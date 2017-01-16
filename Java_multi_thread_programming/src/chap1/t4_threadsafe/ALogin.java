package chap1.t4_threadsafe;

public class ALogin extends Thread {
	@Override
	public void run(){
		LoginServlet.doPost("b", "bb");
	}
}
