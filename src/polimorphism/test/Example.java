package polimorphism.test;

public class Example implements Interface1, Interface2 {

	@Override
	public String method2(String str2) {
		System.out.println("Example Interface2 method2 given: " + str2);
		return "returned" + str2;
	}

	@Override
	public void method1(int int1) {
		System.out.println("Example Interface1 method1 given: " + int1);
	}
	
}
