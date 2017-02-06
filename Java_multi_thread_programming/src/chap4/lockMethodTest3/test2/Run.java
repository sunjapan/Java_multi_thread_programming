package chap4.lockMethodTest3.test2;

public class Run {

	public static void main(String[] args) {
		final Service service1 = new Service(true);
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				service1.serviceMethod();

			}
		});
		thread1.start();
	}
	
}


