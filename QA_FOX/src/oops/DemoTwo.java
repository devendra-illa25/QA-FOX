package oops;

public class DemoTwo {

	public static void main(String[] args) {
		
		//if we create obj for parent class we can access variables and methods
		//from that class only.
		Car car1=new Car();
		car1.color="Red";
		car1.cost=800000;
		car1.model="Swift V01";
		car1.startCar();
		car1.stopCar();
		
		//but if we create obj for child class we can access var and methods
		//from parent and child class.
		
		Benz benz1=new Benz();
		benz1.color="Black";
		benz1.startCar();
		
		benz1.openTopWindowColor="Blcak";
		benz1.autoGearModeOn();
	}
}

class Car{
	int cost;
	String color;
	String model;
	
	public void startCar() {
		System.out.println(model+" is started");
	}
	public void stopCar() {
		System.out.println(model+" is stopped");	
	}
}

//class Benz{
//	int cost;
//	String color;
//	String model;
//	
//	public void startCar() {
//		System.out.println(model+" is started");
//	}
//	public void stopCar() {
//		System.out.println(model+" is stopped");	
//	}
//	
//}

class Benz extends Car{
	String openTopWindowColor;
	
	public void autoGearModeOn() {
		System.out.println("Auto gear mode is on");
	}
}