package Thread;

public class ThreadControl {
	public static void main(String [] args) {
		A t1= new A();
		B t2= new B();
		t1.start();
		t2.start();
	}

}
