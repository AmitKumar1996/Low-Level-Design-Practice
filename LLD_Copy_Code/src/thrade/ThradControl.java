package thrade;

public class ThradControl {

	public static void main(String[] args) {
		Thread t1= new Thread(new A());
		Thread t2=new Thread(new B());
		t1.start();
		t2.start();

	}

}
