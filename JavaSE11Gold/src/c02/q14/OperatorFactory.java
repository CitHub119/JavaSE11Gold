package c02.q14;

import java.util.function.BinaryOperator;

public class OperatorFactory {

	public static BinaryOperator<Integer> add(){
		return (a, b) -> a + b;
	}
	
	public static BinaryOperator<Integer> minus (){
		return (a, b) -> a - b;
	}

}
