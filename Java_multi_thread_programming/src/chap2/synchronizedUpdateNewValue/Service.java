package chap2.synchronizedUpdateNewValue;

public class Service {
	private boolean isContinueRun = true;
	public void runMethod(){
		Object obj = new Object();
		while(isContinueRun ==true){
			synchronized (obj) {
				
			}
		}
		System.out.println("停下来了！");
	}
	public void stopMethod(){
		isContinueRun = false;
	}
}
