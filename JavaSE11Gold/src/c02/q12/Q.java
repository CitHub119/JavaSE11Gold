package c02.q12;

import java.util.function.UnaryOperator;

public class Q {

	public static void main(String[] args) {
		UnaryOperator<String> u = str -> str.concat("@test");
		System.out.println(u.apply("unary operator"));
	}
}
