package chap1.runMethodUseStopMethod;

public class MyThread extends Thread {
	@Override
	public void run(){
		try {
			this.stop();
		} catch (ThreadDeath e) {
			System.out.println("进入了catch方法！");
			e.printStackTrace();
		}
		
	}
}
