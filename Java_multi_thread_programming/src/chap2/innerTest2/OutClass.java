package chap2.innerTest2;

public class OutClass {
	static class InnerClass1 {
		public void method1(InnerClass2 class2) {
			String threadName = Thread.currentThread().getName();
			synchronized (class2) {
				System.out.println(threadName + " 进入InnerClass1类中的method1方法");
				for (int i = 0; i < 10; i++) {
					try {
						System.out.println("i=" + i);
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println(threadName + " 离开InnerClass1类中的method1方法");
			}
		}

		public synchronized void method2() {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " 进入InnerClass1类中的method2方法");
			for (int j = 0; j < 10; j++) {
				try {
					System.out.println("j=" + j);
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println(threadName + " 离开InnerClass1类中的method2方法");
		}

	}
	
	static class InnerClass2 {
		public synchronized void method1() {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " 进入InnerClass2类中的method1方法");
			for (int k = 0; k < 10; k++) {
				try {
					System.out.println("k=" + k);
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println(threadName + " 离开InnerClass2类中的method1方法");
		}
	}
}

