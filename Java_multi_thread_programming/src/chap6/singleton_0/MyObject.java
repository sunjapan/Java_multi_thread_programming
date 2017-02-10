package chap6.singleton_0;

public class MyObject {
	private static MyObject myObject = new MyObject();

	private MyObject() {
	}

	public static MyObject getInstance() {
		return myObject;
	}
}
