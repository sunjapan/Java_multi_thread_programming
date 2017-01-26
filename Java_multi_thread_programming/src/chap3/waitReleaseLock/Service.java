package chap3.waitReleaseLock;

public class Service {
	public void testMethod(Object lock){
		try {
			synchronized (lock) {
				System.out.println("begin wait()");
				lock.wait();
				//Thread.sleep(2000);
				System.out.println("  end wait()");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
