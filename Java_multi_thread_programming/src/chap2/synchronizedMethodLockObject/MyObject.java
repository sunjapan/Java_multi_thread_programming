package chap2.synchronizedMethodLockObject;

public class MyObject {
	//synchronized public void methodA(){
	public void methodA(){
		try {
			System.out.println("begin methodA threadName = " + Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
