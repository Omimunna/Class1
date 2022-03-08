package JavaAccessModifiersOne;

public class ClassA {

	public int myPublicData = 10;
	protected int myProtectedData = 20;
	int myDefaultData = 30;
	private int myPrivateData = 40;

	public static void main(String[] args) {
		ClassA c = new ClassA();
		c.myPublcMethodA();
		c.myprotectedMethod();
		c.myDefaultMethod();
		c.myPrivateMethod();

	}

	public void myPublcMethodA() {
		System.out.println("This is myPublcMethodA from ClassA");
	}

	protected void myprotectedMethod() {
		System.out.println("This is myprotectedMethod from ClassA");

	}

	void myDefaultMethod() {
		System.out.println("This is myDefaultMethod from ClassA");
	}

	private void myPrivateMethod() {
		System.out.println("This is myPrivateMethod from ClassA");
	}

}
