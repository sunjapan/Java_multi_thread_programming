package chap3.joinLong;

public class MyThread extends Thread {
	@Override
	public void run(){
		try {
			System.out.println("begin Timer= " + System.currentTimeMillis());
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
