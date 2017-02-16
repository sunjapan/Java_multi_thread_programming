package chap7.stateTest1;

public class Run {

	public static void main(String[] args) {
		try {
			MyThread t = new MyThread();
			System.out.println("main方法中的状态 1： "
					+ t.getState());
			Thread.sleep(3000);
			t.start();
			Thread.sleep(3000);
			System.out.println("main方法中的状态2： "
					+ t.getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
