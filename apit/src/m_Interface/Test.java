package m_Interface;

public class Test {

	public static void main(String[] args) {
		Bank obj1 = new SBI_Bank();
		Bank obj2 = new HDFCBank();
		obj1.rateOfIntertest();
		obj2.rateOfIntertest();

	}

}
