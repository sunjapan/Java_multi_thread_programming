package chap7.groupRecurseTest;

public class Run {
	public static void main(String[] args) {
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		ThreadGroup groupA = new ThreadGroup(mainGroup, "A");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("runMethod!");
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		ThreadGroup groupB = new ThreadGroup(groupA, "B");
		ThreadGroup[] listgGroup1 = new ThreadGroup[Thread.currentThread()
				.getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(listgGroup1, true);
		for (int i = 0; i < listgGroup1.length; i++) {
			if (listgGroup1[i] != null) {
				System.out.println(listgGroup1[i].getName());
			}
		}

		ThreadGroup[] listgGroup2 = new ThreadGroup[Thread.currentThread()
				.getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(listgGroup2, false);
		for (int i = 0; i < listgGroup2.length; i++) {
			if (listgGroup2[i] != null) {
				System.out.println(listgGroup2[i].getName());
			}
		}
	}
}
