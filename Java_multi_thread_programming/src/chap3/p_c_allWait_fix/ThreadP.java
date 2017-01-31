package chap3.p_c_allWait_fix;

public class ThreadP extends Thread {
	private P p;

	public ThreadP(P p) {
		super();
		this.p = p;
	}
	@Override
	public void run(){
		while(true){
			p.setValue();
		}
	}
	
}
