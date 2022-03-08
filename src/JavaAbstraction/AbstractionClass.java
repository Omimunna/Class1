package JavaAbstraction;

public abstract class AbstractionClass {

	int myData;

	AbstractionClass() {
		System.out.println("AbstractionClass default constructor");
		this.myData =  13;
	}

	abstract void myMethod1();
	abstract void myMethod2();
	abstract void myMethod3();
	abstract void myMethod4();
	abstract void myMethod5();

	final void myAnotherMethod() {
		System.out.println("Do what your Parents tell you to do!");
	}
}
