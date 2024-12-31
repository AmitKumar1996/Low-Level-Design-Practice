package Thread;

public class B extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i= "+i+"Thread B");
		}
	}

}
