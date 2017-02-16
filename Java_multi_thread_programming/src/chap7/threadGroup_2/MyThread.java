package chap7.threadGroup_2;

public class MyThread extends Thread {
	private String num;

	public MyThread(ThreadGroup group, String name, String num) {
		super(group, name);
		this.num = num;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int numInt = Integer.parseInt(num);
		while (this.interrupted() == false) {
			System.out.println("死循环中： " + Thread.currentThread().getName());
		}
	}
}
