package chap3.join_sleep_1;

public class ThreadA extends Thread{
	private ThreadB b;

	public ThreadA(ThreadB b) {
		super();
		this.b = b;
	}
	
	@Override
	public void run(){
		try {
			synchronized (b) {
				b.start();
				Thread.sleep(6000);
				//Thread.sleep不释放锁
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
