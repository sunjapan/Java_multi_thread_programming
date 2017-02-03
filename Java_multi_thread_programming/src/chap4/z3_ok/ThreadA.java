package chap4.z3_ok;

public class ThreadA extends Thread {
	private MyService service;
	public ThreadA(MyService service) {
		super();
		this.service = service;
	}
	@Override
	public void run() {
		service.waitMethod();
	}
}
