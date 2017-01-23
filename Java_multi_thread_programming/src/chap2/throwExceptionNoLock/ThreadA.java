package chap2.throwExceptionNoLock;

public class ThreadA extends Thread {
	private Service service;

	public ThreadA(Service service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		super.run();
		service.testMethod();
	}
}
