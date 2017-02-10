package chap6.singleton_7_1;

import java.io.Serializable;

public class MyObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 888L;

	private static class MyObjectHandler {
		private static MyObject myObject = new MyObject();
	}

	private MyObject() {
	}

	public static MyObject getInstance() {
		return MyObjectHandler.myObject;
	}
	protected Object readResolve() {
		System.out.println("调用了readResolve方法！");
		return MyObjectHandler.myObject;

	}
}
