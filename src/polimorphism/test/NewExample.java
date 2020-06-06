package polimorphism.test;

public class NewExample implements Interface1 {

	@Override
	public void method1(int int1) {
		System.out.println("NewExample Interface1 method1:" + (int1*2));
	}

}
