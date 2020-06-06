package polimorphism.test;

public class ExampleTest {

	
	public static void main(String[] args) {
		Interface1 example1 = new Example();
		
		Interface2 example2 = new Example();
		
		Example example3 = new Example();
		
		example1.method1(10);
		
		example2.method2("example2 method2");
		
		example1 = new NewExample();
		
		example1.method1(10);
	}
}
