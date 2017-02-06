package chap4.lockMethodTest2.test2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
	private ReentrantLock lock = new ReentrantLock();
	private Condition newCondition = lock.newCondition();

	public void waitMethod() {
		try {
			lock.lock();
			newCondition.await();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void notifyMethod() {
		try {
			lock.lock();
			System.out.println("有没有线程正在等待newCondition？"
					+ lock.hasWaiters(newCondition) + " 线程数是多少？"
					+ lock.getWaitQueueLength(newCondition));
			newCondition.signal();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}