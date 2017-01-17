package chap1.samNum;

public class MyThread extends Thread {
	private int i = 5;
	@Override
	public void run(){
		System.out.println("i=" + (i--) + " thread name="+ Thread.currentThread().getName());
	}
}
