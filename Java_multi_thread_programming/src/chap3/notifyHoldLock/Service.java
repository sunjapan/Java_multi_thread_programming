package chap3.notifyHoldLock;

public class Service {
	public void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait() ThreadName="
						+ Thread.currentThread().getName());
				lock.wait();
				System.out.println("  end wait() ThreadName="
						+ Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void synNotifyMethod(Object lock) {
		synchronized (lock) {
			System.out.println("begin notify() ThreadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			lock.notify();
			System.out.println("  end notify() ThreadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());			
		}
	}
}
