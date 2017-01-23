package chap2.synNotExtends;

public class Test {

	public static void main(String[] args) {
		Sub subRef = new Sub();
		MyThreadA a = new MyThreadA(subRef);
		a.setName("a");
		a.start();
		MyThreadB b= new MyThreadB(subRef);
		b.setName("b");
		b.start();		
	}

}
