package chap7.threadExceptionMove;

public class Run1 {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
//		myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
		MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
		myThread.start();

	}

}
