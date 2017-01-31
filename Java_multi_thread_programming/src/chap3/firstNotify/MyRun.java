package chap3.firstNotify;

import org.omg.CosNaming.IstringHelper;

public class MyRun {
	private String lock = new String("");
	private boolean isFirstRunB = false;
	private Runnable runnableA = new Runnable(){
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				synchronized (lock) {
					while(isFirstRunB == false){
						System.out.println("begin wait");
						lock.wait();
						System.out.println("end wait");	
					}
				
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	};
	private Runnable runnableB = new Runnable(){

		@Override
		public void run() {
			synchronized (lock) {
				System.out.println("begin nofity");
				lock.notify();
				System.out.println("end nofity");
				isFirstRunB = true;
			}
		}
		
	};
	public static void main(String[] args) throws InterruptedException {
		MyRun run = new MyRun();
		//Thread a = new Thread(run.runnableA);
		//a.start();

		Thread a = new Thread(run.runnableA);
		a.start();
		Thread.sleep(500);
		Thread b = new Thread(run.runnableB);
		b.start();
		
	}
}
