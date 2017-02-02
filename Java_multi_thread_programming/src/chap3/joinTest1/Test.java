package chap3.joinTest1;

import chap3.waitOld.ThreadSubtract;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread threadTest =new MyThread();
		threadTest.start();
		//Thread.sleep(?);
		System.out.println("我想当threadtest对象执行完毕后我再执行");
		System.out.println("但上面代码中的sleep（）中的值应该写多少呢？");
		System.out.println("答案是根据不能确定");
	}

}
