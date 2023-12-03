package c02.q11;

import java.util.function.BiFunction;

public class Q {
	
	private final BiFunction<String, Integer, String> zeroPad = new ZeroPad();

	public static void main(String[] args) {
		BiFunction<Integer, Integer, String> test = (a, b)->Integer.toString(a + b);
		System.out.println(test.apply(1,2));

		Q q = new Q();
		q.main2();
		
	}

	public void main2 () {
		System.out.println(zeroPad.apply("123", 7));
	}
}
