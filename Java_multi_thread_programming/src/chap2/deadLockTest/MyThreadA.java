package chap2.deadLockTest;

public class MyThreadA extends Thread {
	MyService svc;

	public MyThreadA(MyService svc) {
		super();
		this.svc = svc;
	}

	@Override
	public void run() {
		svc.aMethod();
	}
}
