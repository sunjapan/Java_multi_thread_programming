package chap2.StringAnadSyn2;

public class ThreadB extends Thread {
	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}
	@Override
	public void run(){
		service.print(new Object());
	}
}
