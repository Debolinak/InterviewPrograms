package m_superTest;

public class Son extends Father {

	String car = "I am Son's Car";
	
	void Bike()
	{
		System.out.println(" I am son's Bike");
		super.Bike();
		System.out.println(car);
	}

	public static void main(String[] args) {
		

	}

}

