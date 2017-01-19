package chap1.suspend_resume_dead_lock;

public class SynchronizedObject {
	synchronized public void printString(){
		System.out.println("begin");
		if(Thread.currentThread().getName().equals("a")){
			System.out.println("a线程永远 suspend了！");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}
}
