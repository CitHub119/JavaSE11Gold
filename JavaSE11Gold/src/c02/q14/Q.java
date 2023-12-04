package c02.q14;

import java.util.function.BinaryOperator;

public class Q {

	public static void main(String[] args) {
		BinaryOperator<String> op = (s1, s2) -> s1.concat(s2);
		System.out.println(op.apply("A", "B"));
	}

}
