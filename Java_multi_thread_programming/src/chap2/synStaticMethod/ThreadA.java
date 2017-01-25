package chap2.synStaticMethod;

public class ThreadA extends Thread {
	@Override
	public void run(){
		Service.printA();
	}
}
