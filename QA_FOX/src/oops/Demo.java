package oops;


public class Demo {

	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		
		dog1.breed="doberman";
		dog1.name="Ginger";
		dog1.color="black";
		
		dog1.barking();
		dog1.sleeping();
		dog1.walking();
		dog1.eating();
		dog1.running();
		
		Dog dog2=new Dog();
		
		dog2.breed="pug";
		dog2.name="Ruby";
		dog2.color="Brown";
		
		dog2.barking();
		dog2.sleeping();
		dog2.walking();
		dog2.eating();
		dog2.running();
		
		Dog dog3=new Dog();
	
	dog3.breed="demation";
	dog3.name="piper";
	dog3.color="white";
	
	dog3.barking();
	dog3.sleeping();
	dog3.walking();
	dog3.eating();
	dog3.running();
	
}
}
class Dog{
	//states (variables)
	String breed;
	String name;
	String color;
	
	//behaviours (Methods)
	
	public void barking() {
		System.out.println(breed+" is barking");
		}
	
	public void eating() {
		System.out.println(breed+" is eating");
	}
	
	public void sleeping() {
		
		System.out.println(breed+" is sleeping");
	}
	
	public void walking() {
		
		System.out.println(breed+" is walking");
	}
	
	public void running() {
		
		System.out.println(breed+" is running");
		System.out.println("...........................");  
}

}


