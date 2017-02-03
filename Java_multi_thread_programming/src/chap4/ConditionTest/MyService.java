package chap4.ConditionTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean hasValue = false;
	public void set(){
		try {
			lock.lock();
			while(hasValue == true){
				condition.await();
			}
			System.out.println("打印★");
			hasValue = true;
			condition.signal();
			for (int i = 5; i > 0; i--) {
				System.out.println("In set() "+i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	public void get(){
		try {
			lock.lock();
			while(hasValue == false){
				condition.await();
			}
			System.out.println("打印☆");
			hasValue = false;
			condition.signal();
			for (int i = 5; i > 0; i--) {
				System.out.println("In get() "+i);
			}
			
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
}
