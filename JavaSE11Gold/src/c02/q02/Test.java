package c02.q02;

public class Test {
	public void execute() {
		System.out.println("お決まりの事前処理");
		A a = Factory.create();
		a.hello();
		System.out.println("お決まりの事後処理");
	}
}
