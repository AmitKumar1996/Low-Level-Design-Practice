package OOPS;

public class Student {
	private int age;
	public void setAge(int age) {
	
		
	if(age < 0) {
		System.out.println("throw an Error here");
		//return 0;
	}
	 this.age=age;
	}
	

private String name;
public void setName(String name) {
	this.name=name;
}
 void display() {
   System.out.println("My name is "+name);
   System.out.println("My age is "+age);
 }


}
