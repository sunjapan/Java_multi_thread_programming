package chap3.stack_2_new;

import java.util.List;
import java.util.ArrayList;

public class MyStack {
	private List list = new ArrayList();

	synchronized public void push() {
		try {
			while (list.size() == 1) {
				this.wait();
			}
			list.add("anyString=" + Math.random());
			this.notify();
			System.out.println("Push=" + list.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	synchronized public String pop() {
		String returnValue = "";
		try {
			while (list.size() == 0) {
				System.out.println("pop操作中的：" + Thread.currentThread().getName() + "线程呈wait状态");
				this.wait();
			}
			returnValue = ""+list.get(0);
			list.remove(0);
			this.notify();
			System.out.println("Pop=" + list.size());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnValue;
	}
}
