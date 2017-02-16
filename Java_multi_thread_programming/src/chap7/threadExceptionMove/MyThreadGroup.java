package chap7.threadExceptionMove;

public class MyThreadGroup extends ThreadGroup {
	public MyThreadGroup(String name){
		super(name);
	}
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		super.uncaughtException(t, e);
		System.out.println("线程组的异常处理");
		e.printStackTrace();
	}
}
