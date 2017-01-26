package chap3.notifyHoldLock;


public class Test {

	public static void main(String[] args) {
		try {
			Object lock = new Object();
			ThreadA a = new ThreadA(lock);
			a.start();
			Thread.sleep(1000);
			NotifyThread nofifyThread = new NotifyThread(lock);
			nofifyThread.start();
			synNotifyMethodThread c = new synNotifyMethodThread(lock);
			c.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
