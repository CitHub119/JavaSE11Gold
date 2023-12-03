package c02.q06;

import java.util.function.Predicate;

public class Q {

	public static void main(String[] args) {
//		new Predicate<String>() {
//			@Override
//			public boolean test(String t) {
//				return false;
//			}
//		};
		
		Predicate<String> p1 = x -> x.isBlank();
		System.out.println(p1.test(""));
	}

}
