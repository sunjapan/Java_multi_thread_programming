package chap3.p_c_allWait_fix;

public class C {
	private String lock;

	public C(String lock) {
		super();
		this.lock = lock;
	}

	public void getValue() {
		try {
			synchronized (lock) {
				if (ValueObject.value.equals("")) {
					System.out.println("消费者 " + Thread.currentThread().getName() + " WAITING 了");
					lock.wait();
				}
				System.out.println("消费者 " + Thread.currentThread().getName() + " RUNNABLE 了");
				ValueObject.value = "";
				lock.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
