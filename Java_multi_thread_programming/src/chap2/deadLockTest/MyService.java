package chap2.deadLockTest;

public class MyService {
	
	MyService otherService;

	public MyService getOtherService() {
		return otherService;
	}

	public void setOtherService(MyService otherService) {
		this.otherService = otherService;
	}

	synchronized void aMethod(){
		System.out.println("Enter a method threadname = "+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		otherService.aMethod();
		
		System.out.println("Exit a method threadname = "+Thread.currentThread().getName());
	}
	
}
