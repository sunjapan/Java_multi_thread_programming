package chap6.singleton_7_1;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}
}
