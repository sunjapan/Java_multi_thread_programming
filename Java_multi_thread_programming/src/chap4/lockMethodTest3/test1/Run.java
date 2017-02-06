package chap4.lockMethodTest3.test1;

public class Run {

	public static void main(String[] args) {
		final Service service1 = new Service(true);
		final Service service2 = new Service(false);
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				service1.serviceMethod();

			}
		});
		thread1.start();
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				service2.serviceMethod();

			}
		});
		thread2.start();
	}
	
}


