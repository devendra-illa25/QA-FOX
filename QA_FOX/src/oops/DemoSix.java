package oops;

public class DemoSix {

	public static void main(String[] args) {
		//ClassA a1=new ClassA();
		
		//a1.add(5, 6);  // here object is created for parent class
		
	//	ClassB a2=new ClassB();
		// a2.add(5, 6);	//here object is created for child class but
					// it will take execute only child class even tough we use extend keyword.
		
		
		ClassB a2=new ClassB();
		a2.add(5, 6); /// now it will execute parent class 
		
	}
}

class ClassA{
	public void add(int a, int b) {
		System.out.println("Class A-The sum of "+a+" and "+b+" is: "+(a+b));
	}
}

class ClassB extends ClassA{
//	public void add(int a, int b) {
//		System.out.println("Class B-The sum of "+a+" and "+b+" is: "+(a+b));
	
	public void add(int a, int b,int c) {
		System.out.println(" Class B-The sum of "+a+" and "+b+" and "+c+" is: "+(a+b));
	}
}