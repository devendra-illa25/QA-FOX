package oops;

public abstract class Demoseven {

	int a=5;
	
	public abstract void printname();
	
	public void printwebsite() {
		System.out.println("Website is QAFox.com");
	}
	
}

class ClassXYZ extends Demoseven{

	
	public void printname() {
		
		System.out.println("My name is Arun");
	}
	
}
