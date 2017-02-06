package chap4.test2;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
	public ReentrantLock lock = new ReentrantLock();

	public void serviceMethod1() {
		try {
			lock.lock();
			System.out
					.println("ThreadName=" + Thread.currentThread().getName());
			Thread.sleep(Integer.MAX_VALUE);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
}
