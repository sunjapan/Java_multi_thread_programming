package chap7.groupInnerStop;

public class MyThread extends Thread{
	public MyThread(ThreadGroup group, String name){
		super(group, name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ThreadName=" + Thread.currentThread().getName()+" 准备开始死循环了：）");
		while(!this.interrupted()){
		}
		System.out.println("ThreadName=" + Thread.currentThread().getName()+" 结束了：）");
	}
}
