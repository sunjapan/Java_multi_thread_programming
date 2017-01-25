package chap2.deadLockTest;

public class MyThreadB extends Thread {
	MyService svc;

	public MyThreadB(MyService svc) {
		super();
		this.svc = svc;
	}
	@Override
	public void run(){
		svc.aMethod();
	}
}
