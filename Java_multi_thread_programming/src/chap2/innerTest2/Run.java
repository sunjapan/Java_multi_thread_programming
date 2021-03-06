package chap2.innerTest2;

import chap2.innerTest2.OutClass.InnerClass1;
import chap2.innerTest2.OutClass.InnerClass2;

public class Run {

	public static void main(String[] args) {
		final InnerClass1 in1 = new InnerClass1();
		final InnerClass2 in2 = new InnerClass2();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				in1.method1(in2);
			}
		},"T1");
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				in1.method2();
			}
		},"T2");
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				in2.method1();
			}
		},"T2");
		t1.start();
		t2.start();
		t3.start();
	}

}
