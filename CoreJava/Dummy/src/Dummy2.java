class A{
	public static void m1() {
		System.out.println("hi");
	}
}

class B extends A{
	public static void m1() {
		System.out.println("hello");
	}
}




public class Dummy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A a = new A(); a.m1(); B b = new B(); b.m1();
		 */
		A a = new B();
		a.m1();
		B b =(B) new A();
		b.m1();
		
	}

}
