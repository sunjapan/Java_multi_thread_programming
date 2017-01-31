package chap3.p_c_allWait_fix;

public class P {
	private String lock;

	public P(String lock) {
		super();
		this.lock = lock;
	}

	public void setValue() {
		try {
			synchronized (lock) {
				while (!ValueObject.value.equals("")) {
					System.out.println("生产者 " + Thread.currentThread().getName() + " WAITING 了");
					lock.wait();
				}
				System.out.println("生产者 " + Thread.currentThread().getName() + " RUNNABLE 了");
				String value = System.currentTimeMillis() + "_" + System.nanoTime();
				ValueObject.value = value;
				lock.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
