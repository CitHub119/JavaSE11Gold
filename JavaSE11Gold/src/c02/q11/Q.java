package c02.q11;

import java.util.function.BiFunction;

public class Q {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, String> test = (a, b)->Integer.toString(a + b);
		System.out.println(test.apply(1,2));
	}

}
