package chap4.lockInterruptiblyTest2;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		final MyService service = new MyService();
		Runnable runnableRef = new Runnable() {
			
			@Override
			public void run() {
				try {
					service.waitMethod();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread threadA = new Thread(runnableRef);
		threadA.setName("A");
		threadA.start();
		Thread.sleep(500);
		Thread threadB = new Thread(runnableRef);
		threadB.setName("B");
		threadB.start();
		threadB.interrupt();
		System.out.println("main end");
	}

}
