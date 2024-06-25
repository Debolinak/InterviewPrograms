package java_Oops;

public class C_methodOverloading {

	public static void sum(int i , int j)
	{
		int k = i+j;
		System.out.println(k);
	}
	public static void sum(double i , double j)
	{
		double k = i+j;
		System.out.println(k);
	}
	public static void sum(int i , int j , int l)
	{
		int k = i+j+l;
		System.out.println(k);
	}
	void sum(int i , int j, int l , int m)
	{
		int k = i+j+l+m;
		System.out.println(k);
	}
	public static void main(String[] args) {
		
		sum(10,10);
		sum(10.1,10.1);
		sum(10,20,30);
		C_methodOverloading obj = new C_methodOverloading();
		obj.sum(10, 20, 30,40);
		
	}

}
