
@FunctionalInterface
interface ITest{
	//we can have at most one abstract method in functional inerface 
	public abstract int m1(int a,int b);
	//we can create any no.of default methods
	//we can call default methods with the reference
	default void m2() {
		System.out.println("this is a default method m2()");
	}
	//we can create any no.of static methods
	//static methods can not call by reference
	//we should call with the interface name
	static void m3() {
		System.out.println("this is a static method m3()");
	}
		
}

public class MainTest {

	public static void main(String[] args) {
		// lambda expression is a anonymous function which means a function without name,
		//return type,without access modifier
		ITest test = (a,b)->a+b;
		System.out.println(test.m1(10,20));
		test.m2();
		ITest.m3();
	}

}
