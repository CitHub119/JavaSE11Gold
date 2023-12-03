package c02.q10;

import java.util.function.Function;

public class Q {

	public static void main(String[] args) {
		Function<Integer, Integer> a = x -> x + 2;
		Function<Integer, Integer> b = x -> x * 2;
		System.out.println(a.compose(b).apply(10));
		System.out.println(a.andThen(b).apply(10));
//		System.out.println(a.after(b).apply(10));メソッドなし
//		System.out.println(a.before(b).apply(10));メソッドなし
	}

}
