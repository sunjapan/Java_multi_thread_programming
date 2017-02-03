package chap4.MustUseMoreCondition_OK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	private Condition conditionA = lock.newCondition();
	private Condition conditionB = lock.newCondition();

	public void awaitA() {
		try {
			lock.lock();
			System.out.println("begin awaitA时间为 " + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			conditionA.await();
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
			conditionB.await();
			System.out.println("  end awaitB时间为 " + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	public void signallAll_A(){
		try {
			lock.lock();
			System.out.println(" signallAll时间为 " + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			conditionA.signalAll();
		} finally{
			lock.unlock();
		}
	}
	public void signallAll_B(){
		try {
			lock.lock();
			System.out.println(" signallAll时间为 " + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			conditionB.signalAll();
		} finally{
			lock.unlock();
		}
	}
}
