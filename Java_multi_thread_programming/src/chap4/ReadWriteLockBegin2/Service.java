package chap4.ReadWriteLockBegin2;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	public void read() {
		try {
			lock.writeLock().lock();
			System.out.println("获得读锁 " +Thread.currentThread().getName() + " "+System.currentTimeMillis());
			Thread.sleep(10000);
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			lock.writeLock().unlock();
		}
	}
}
