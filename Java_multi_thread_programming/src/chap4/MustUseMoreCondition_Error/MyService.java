package chap4.MustUseMoreCondition_Error;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void awaitA() {
		try {
			lock.lock();
			System.out.println("begin awaitA时间为 " + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			condition.await();
			System.out.println("  end awaitA时间为 " + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	public void awaitB() {
		try {
			lock.lock();
			System.out.println("begin awaitB时间为 " + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			condition.await();
			System.out.println("  end awaitB时间为 " + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	public void signallAll(){
		try {
			lock.lock();
			System.out.println(" signallAll时间为 " + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			condition.signalAll();
		} finally{
			lock.unlock();
		}
	}
}
