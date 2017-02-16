package chap7.stateTest4;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		try {
			MyThread t1 = new MyThread();
			t1.start();
			Thread.sleep(1000);
			System.out.println("main方法中的t状态：" + t1.getState());
//			synchronized (Lock.lock) {
//				Lock.lock.notify();
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
