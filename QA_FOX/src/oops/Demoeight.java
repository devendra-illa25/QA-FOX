package oops;

public class Demoeight {

	public static void main(String[] args) {
		
		//ClassX x=new ClassX(); we cant mplement for super class n abstract
		
		ClassY y=new ClassY();
		y.methodA(); // we can create for sub class
		y.methodB();
	}
	
}

abstract class ClassX{
	
	public abstract void methodA();
	public void methodB() {
		System.out.println("Inside methodB");
	
	
}
}

class ClassY extends ClassX{
	

	public void methodA() {
		System.out.println("Inside MethodA");
		
	}
}