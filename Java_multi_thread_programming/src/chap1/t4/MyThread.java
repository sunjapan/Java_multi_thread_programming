package chap1.t4;

public class MyThread extends Thread {
	private int count = 5;

	@Override
	public synchronized void run(){
		super.run();
			count--;
				System.out.println("由"+this.currentThread().getName()+"计算，count= " + count);
	}
}
