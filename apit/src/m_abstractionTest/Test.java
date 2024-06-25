package m_abstractionTest;

public class Test extends AbstractClass {

	public static void main(String[] args) {
		AbstractClass obj = new Test();
		obj.imcompleteMethod();

	}

	@Override
	void imcompleteMethod() {
		System.out.println("I am complete now");
		
	}

}
