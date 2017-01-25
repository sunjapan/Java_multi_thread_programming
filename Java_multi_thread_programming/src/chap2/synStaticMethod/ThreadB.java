package chap2.synStaticMethod;

public class ThreadB extends Thread {
	@Override
	public void run(){
		Service.printB();
	}
}
