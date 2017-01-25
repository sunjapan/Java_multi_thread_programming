package chap2.StringAnadSyn2;

public class ThreadA extends Thread {
	private Service service;

	public ThreadA(Service service) {
		super();
		this.service = service;
	}
	@Override
	public void run(){
		service.print(new Object());
	}
}
