package c02.q09;

import java.util.function.Function;

public class Q {

	public static void main(String[] args) {
		Function<String, Integer> f = (s) -> {
			return s.length();
		};
		System.out.println(f.apply("文字数のカウント"));
	}
}
