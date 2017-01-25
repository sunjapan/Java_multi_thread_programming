package chap2.atomicIntegerNoSafe;

public class MyThread extends Thread {
	MyService service;

	public MyThread(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.addNum();
	}
}
