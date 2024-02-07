package oops;

public final class DemoNine {

public static void main(String[] args) {
		DogX d=new DogX();
		d.setBreed("Pug");
		d.setName("Lucy");
		d.setColor("Brown");
		
		d.getBreed();
		d.getName();
		d.getColor();

}
}

class DogX{
	private String breed; //make variables as private 
	private String name;
	private String color; //to use these prvate varables n man class we use 
						//getter and setter methods n sde the class.
	
	
	//setter methods for insert the value
	
	public void setBreed(String breed) {
		this.breed=breed;
		
	}
	
public void setName(String name) {
		
		this.name = name;
		
	}
	
	public void setColor(String color) {
		
		this.color = color;
		
	}		
	
	
//getter method to retrive the value.
	
	public void getBreed() {
		
		System.out.println("The breed of the Dog is "+breed);
		
	}
	
	public void getName() {
		
		System.out.println("The name of the Dog is "+name);
		
	}
	
	public void getColor() {
		
		System.out.println("The color of the Dog is "+color);
		
	}
	

}
	
	

