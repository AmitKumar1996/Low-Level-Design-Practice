package thrade;

public class A implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<=10;i++) {
			System.out.println("Thrade A"+i);
		}
		
		
	}
	

}
