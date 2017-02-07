package chap4.awaitUninterruptiblyTest_2;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		MyThread myThread = new MyThread(service);
		myThread.start();
		Thread.sleep(3000);
		myThread.interrupt();

	}

}
