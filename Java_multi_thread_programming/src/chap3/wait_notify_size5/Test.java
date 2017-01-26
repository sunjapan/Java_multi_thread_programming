package chap3.wait_notify_size5;

public class Test {

	public static void main(String[] args) {
		try {
			Object lock = new Object();
			ThreadA a = new ThreadA(lock);
			a.setName("A");
			a.start();
			Thread.sleep(50);
			ThreadB b = new ThreadB(lock);
			b.setName("B");
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
