package method_OverRiding;

public class Son extends Father {
	void Bike()
	{
		System.out.println("I am Son's Bike");
	}
	public static void main(String[] args) {
		Father obj1 = new Father();
		Son obj2 = new Son();
		Father obj3 = new Son(); // runTime Polymorphism
		obj1.Bike();
		obj2.Bike();
		obj3.Bike();
		
}
}