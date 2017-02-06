package chap4.tryLock_param;

import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	public ReentrantLock lock = new ReentrantLock();
	public void waitMethod(){
		try {
			if(lock.tryLock()){
				System.out.println(Thread.currentThread().getName()+"获得锁");
				
			}else{
				System.out.println(Thread.currentThread().getName()+"没有获得锁");
				lock.lock();
			}
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"正在运行trylock之后的代码");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(lock.isHeldByCurrentThread())
				lock.unlock();
		}
	}
}
