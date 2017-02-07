package chap4.condition123;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Run {
	private static ReentrantLock lock = new ReentrantLock();
	final private static Condition conditinonA = lock.newCondition();
	final private static Condition conditinonB = lock.newCondition();
	final private static Condition conditinonC = lock.newCondition();

	public static void main(String[] args) {
		Thread threadA = new Thread() {
			public void run() {
				try {
					lock.lock();
					while (F.nextPrintWho != 1) {
						conditinonA.await();
					}
					for (int i = 0; i < 3; i++) {
						System.out.println("ThreadA " + (i + 1));
					}
					F.nextPrintWho = 2;
					conditinonB.signalAll();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		};
		
		Thread threadB = new Thread() {
			public void run() {
				try {
					lock.lock();
					while (F.nextPrintWho != 2) {
						conditinonA.await();
					}
					for (int i = 0; i < 3; i++) {
						System.out.println("ThreadB " + (i + 1));
					}
					F.nextPrintWho = 3;
					conditinonC.signalAll();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		};
		
		Thread threadC = new Thread() {
			public void run() {
				try {
					lock.lock();
					while (F.nextPrintWho != 3) {
						conditinonA.await();
					}
					for (int i = 0; i < 3; i++) {
						System.out.println("ThreadC " + (i + 1));
					}
					F.nextPrintWho = 1;
					conditinonA.signalAll();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		};
		Thread[] aArray = new Thread[5];
		Thread[] bArray = new Thread[5];
		Thread[] cArray = new Thread[5];
		for (int i = 0; i < 5; i++) {
			aArray[i] = new Thread(threadA);
			bArray[i] = new Thread(threadB);
			cArray[i] = new Thread(threadC);
			aArray[i].start();
			bArray[i].start();
			cArray[i].start();
		}
	}
}
