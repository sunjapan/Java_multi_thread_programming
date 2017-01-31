package chap3.stack_1;

public class C {
	MyStack myStack;

	public C(MyStack myStack) {
		super();
		this.myStack = myStack;
	}
	public void popService(){
		System.out.println("pop="+myStack.pop());
	}
}
